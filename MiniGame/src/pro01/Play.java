package pro01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Play extends Thread {
	protected int choice_subway;
	protected boolean player1Turn = true;
	private List<String> duplicateValue = new ArrayList<>();
	private boolean gameOver = false;
	private Thread player1Thread;
	private Thread player2Thread;

	public Play(int choice_subway) {
		this.choice_subway = choice_subway;
	}

	@Override
	public void run() {
		player1Thread = new Thread(new PlayerThread(1));
		player2Thread = new Thread(new PlayerThread(2));

		player1Thread.start();
		player2Thread.start();

		TimerTask task = new TimerTask() {
			public void run() {
				System.out.println("\n제한 시간이 지났습니다! 패배하였습니다. 아무키나 눌러 나가십시");
				gameOver = true;
				player1Thread.interrupt();
				player2Thread.interrupt();
				
			}
		};

//		Timer timer = new Timer();
//		timer.schedule(task, 5000);

		while (!gameOver) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

//		timer.cancel();
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
			System.out.println(Thread.currentThread());
			SubwayList subwayList = new SubwayList(choice_subway);

			while (!gameOver) {
				synchronized (this) {
					if ((playerNumber == 1 && player1Turn) || (playerNumber == 2 && !player1Turn)) {
						System.out.println("--------------------");
						System.out.printf("%d번째 플레이어\n", playerNumber);
						System.out.println("--------------------");
						System.out.printf("%d호선 지하철 역 입력 : ", choice_subway);
						String userInput = null;

						TimerTask task = new TimerTask() {
							public void run() {
								System.out.println("timer task"+ Thread.currentThread());
								System.out.println("\n제한 시간이 지났습니다! 패배하였습니다. 아무키나 눌러 나가십시오");
								gameOver = true;
								player1Thread.interrupt();
								player2Thread.interrupt();
								
							}
						};
						
						Timer timer = new Timer();
						
						try {

							timer.schedule(task, 5000);
							userInput = sc.nextLine();
							
						} catch(Exception e) {
							System.out.print("error");
						} finally {
							timer.cancel();
						}
					
						
						if (duplicateValue.contains(userInput)) {
							System.out.println("이미 입력한 값입니다.");
							gameOver = true;
						} else if (subwayList.getList().contains(userInput)) {
							System.out.println("정답입니다.");
							duplicateValue.add(userInput);
							System.out.println("중복된 값 : " + duplicateValue);
							player1Turn = !player1Turn;
						} else {
							System.out.println("오답입니다. 게임이 종료됩니다.");
							gameOver = true;
						}
					}
				}
			}

			System.out.print("쓰레드가 종료되었습니다.");

			sc.close();
		}
	}
}
