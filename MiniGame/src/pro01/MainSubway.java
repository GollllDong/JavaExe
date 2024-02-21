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
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("지하철 게임에 오신것을 환영합니다.");
		System.out.println("저희 게임은 2인 기준이며 1번 플레이어가 게임을 원하는 호선을 입력하시고");
		System.out.println("Enter키를 입력해주시면 게임이 시작됩니다.");
		System.out.println("게임이 시작되면 해당 호선에 대한 지하철 역을 입력해주시고 제한됩니다.");
		System.out.println("만약 지하철 역을 입력하셨을 때 space bar나 .을 붙이게 될 경우 오답이라고 나올 수 있으니 주의바랍니다!!");
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("현재는 2~4호선만 가능합니다.");
		System.out.print("진행할 지하철 호선 입력 : ");
		Scanner sc = new Scanner(System.in);
		int choice_subway = sc.nextInt();

		if (choice_subway > 1 && choice_subway < 5) {
			System.out.println("게임 시작을 원하시면 0번을 입력해주세요");
			int temp2 = sc.nextInt();
			System.out.println("게임을 시작합니다.!!");
			if (temp2 == 0) {

				Play p = new Play(choice_subway);
				switch (choice_subway) {
				case 2, 3, 4:
					// SubwayList 클래스에 구성된 2호선 로직으로 이동.
//					System.out.println("2호선 로직으로 이동");
//					SubwayList.Line_two();
					p.run();
					break;

				default:
					System.out.println("해당 노선은 현재 존재하지 않는 노선입니다.");
				}
			}
		} else {
			System.out.println("입력하신 노선은 없는 노선입니다.");
		}
		System.out.println("test");

		sc.close();
		return;
		
	}
}