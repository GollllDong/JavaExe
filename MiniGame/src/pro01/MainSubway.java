package pro01;

import java.util.Scanner;

public class MainSubway {
	public static void main(String[] args) {
//		2명 기준	
//		1. 플레이어 입장하면 메인메소드가 있는 메인파일에서 인사말 + 게임에 대한 간단한 설명? 해주고
//		2. 게임 시작을 원하면 엔터를 쳐주세요 -> canner.nextLine(); 이거로 
//		3. 게임 시작 -> 3초정도 딜레이 -> 메인 쓰레드 실행이 되고, 서브 스레드를 실행하게 하고 join으로 메인이 끝까지 기다리게 한다.
//		4. 플레이어 1, 2 서로 번갈아가면서 입력받게 하고, 5초라는 제한시간 만약 조금이라도 오타가 있다면 점수깎는거 -> 오타발생 시 패배
//		5. 이기면 이긴 플레이어 +1 점, 만약 2점이 먼저 되는 플레이어가 승리
		System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
		System.out.println("      ===========지하철 게임===========");
		System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
		System.out.println("|              게임 이용 방법                   |");
		System.out.println("| 1) 1번 플레이어가 게임을 원하는 호선을 입력         |");
		System.out.println("| 2) 숫자 0 입력시 게임이 시작됩니다.               |");
		System.out.println("| 3) 제한시간 5초안에 해당 호선의 역을 입력           |");
		System.out.println("|!! ===========!!!주의사항!!!=========== !!    |");
		System.out.println("|        !!답 입력시 '역'은 생략해주세요.!!         |");
		System.out.println("|Space bar나 .을 사용하면 오답 처리될 수 있습니다.!!  |");
		System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
		System.out.println("|          현재는 2~4호선만 가능합니다.            |");
		System.out.println("+-------------------------------------------+");
		System.out.print("진행할 지하철 호선을 입력하세요: ");

		Scanner sc = new Scanner(System.in);
		int choice_subway = sc.nextInt();

		if (choice_subway > 1 && choice_subway < 5) {
			System.out.println("게임 시작을 원하시면 0번을 입력해주세요");
			int temp2 = sc.nextInt();
			System.out.println("게임을 시작합니다!!");
			if (temp2 == 0) {

				Play p = new Play(choice_subway);
				switch (choice_subway) {

				case 2, 3, 4:
					p.run();
					break;

				default:
					System.out.println("해당 노선은 현재 존재하지 않는 노선입니다.");
				}
			}
		} else {
			System.out.println("입력하신 노선은 없는 노선입니다.");
		}

		sc.close();
		return;

	}
}