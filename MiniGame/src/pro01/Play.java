package pro01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Play extends Thread {
	protected int choice_subway;
	protected boolean player1Turn = true; // 사용자 턴 확인
	private List<String> duplicateValue = new ArrayList<>(); // 사용자 입력 값 중복 확인 리스트
	private boolean gameOver = false;
	private Thread player1Thread;
	private Thread player2Thread;

	public Play(int choice_subway) {
		this.choice_subway = choice_subway;					 // MainSubway에서 사용자가 선택한 호선을 받아온다.
	}

	@Override
	public void run() {
		player1Thread = new Thread(new PlayerThread(1)); 	 // 플레이어 1, 2에 대한 스레드를 생성 및 인자 값 전달
		player2Thread = new Thread(new PlayerThread(2));

		player1Thread.start();
		player2Thread.start();

//		Timer timer = new Timer();							// *시간제한을 인터럽트가 발생*
//		timer.schedule(task, 5000);

		while (!gameOver) { // 플레이어가 사용자와 게임시 0.1초씩 일시 정지 
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

//		timer.cancel();										// 실제 적용되는 코드 밖에서 timer를 중지시키게 되면서 스레드가 지속적으로 돌아간다. 
		player1Thread.interrupt();
		player2Thread.interrupt();
	}

	class PlayerThread implements Runnable {
		private int playerNumber;
		private Scanner sc;

		public PlayerThread(int playerNumber) {
			this.playerNumber = playerNumber;
			this.sc = new Scanner(System.in);
		}

		@Override
		public void run() {
			SubwayList subwayList = new SubwayList(choice_subway);

			while (!gameOver) {
				synchronized (this) {
					if ((playerNumber == 1 && player1Turn) || (playerNumber == 2 && !player1Turn)) {
						System.out.println("-----------------------");
						System.out.printf("|     %d번째 플레이어     |\n", playerNumber);
						System.out.println("-----------------------");
						System.out.printf("%d호선 역 입력 : ", choice_subway);
						String userInput = null;

						TimerTask task = new TimerTask() {		// 플레이어의 각각 입력을 5초를 넘어가면 수행할 로직
							public void run() {
								
								gameOver = true;
								player1Thread.interrupt();		// 스레드 정지
								player2Thread.interrupt();

							}
						};

						Timer timer = new Timer();

						try {
							timer.schedule(task, 5000);			// 5초마다 위에서 생성한 task객체의 run 메소드를 실행시키게 한다. 
							userInput = sc.nextLine();

						} catch (Exception e) {System.out.println("\n입력 제한 시간이 지났습니다!");} 
						finally {								// 무조건  시켜서 다른 플레이어가 사용할 수 있게 timer를 초기화(중지).
							timer.cancel();
						}

						if (duplicateValue.contains(userInput)) {
							System.out.println("이미 입력한 값입니다.");
							System.out.println("프로그램을 종료합니다.");
							gameOver = true;
						} else if (subwayList.getList().contains(userInput)) {	// 사용자 입력값과 실제 저장된 값과 일치하는지 확인
							System.out.println("정답입니다.");
							duplicateValue.add(userInput);						// 새로운 ArrayList에 입력 값 추가
							player1Turn = !player1Turn;							// 턴을 바꿔준다.
						} else {
							System.out.println("================");
							System.out.println("프로그램을 종료합니다.");
							System.out.println("@@@@@@@@@@@@@@@@");
							gameOver = true;
						}
					}
				}
			}
			sc.close();
			
		}
	}
}
