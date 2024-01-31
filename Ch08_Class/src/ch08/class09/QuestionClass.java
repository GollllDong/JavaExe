package ch08.class09;

import java.util.Scanner;


/*
1.FruitMain클래스에		
	현재는 buyer.buyApple(seller, 2000); 처럼 프로그래밍되어
	있습니다.
	아래처럼 seller를 중심으로 수정하세요.
	seller.saleApple(buyer, 2000);

2. 중화요리집을 임의대로 클래스로 만드세요

3. 나는 마트에 가서 5000원을 주고 배 가격 2500를 샀다를 
   클래스로 설계해서 프로그래밍 하세요
   
4. 노래를 나타내는 Song이라는 클래스를 설계하세요.
   <필드>
    노래제목 title
    가수    artist
    앨범제목 album
    작곡가  composer
    노래가 발표된 연도 year
    노래가 속한 앨범에서의 트랙 번호를 나타내는 track

   <메서드>
    노래의 정보를 저장하는 setSongInfo(...) : 관련된 매개변수를 인자로 넘겨줌
    노래의 정보를 나타내는 show()

   <main 실행>
    ABBA의 "Dancing Queen"노래를 Song객체로 생성하고
    Show()로 출력하세요

5. Rectangle클래스를 작성하세요
   int타입의 x1, y1, x2, y2 : 사각형을 구성하는 두 점의 좌표
   void set(int x1, int y1, int x2, int y2) : 좌표 설정
   int square() : 사각형 넓이 리턴
   void show() : 좌표와 넓이 등 직사각형 정보의 화면 출력
   boolean equals(Rectangle r) : 인자로 전달된 객체 r과 현 객체가 동일한 좌표의 직사각형이면 true 리턴
*/

public class QuestionClass {


	public static void printMenu() {
	//menuStr에 문제를 복사한다
	String menuStr = "1.FruitMain클래스에		\r\n"
			+ "	현재는 buyer.buyApple(seller, 2000); 처럼 프로그래밍되어\r\n"
			+ "	있습니다.\r\n"
			+ "	아래처럼 seller를 중심으로 수정하세요.\r\n"
			+ "	seller.saleApple(buyer, 2000);\r\n"
			+ "\r\n"
			+ "2. 중화요리집을 임의대로 클래스로 만드세요\r\n"
			+ "\r\n"
			+ "3. 나는 마트에 가서 5000원을 주고 배 가격 2500를 샀다를 \r\n"
			+ "   클래스로 설계해서 프로그래밍 하세요\r\n"
			+ "   \r\n"
			+ "4. 노래를 나타내는 Song이라는 클래스를 설계하세요.\r\n"
			+ "   <필드>\r\n"
			+ "    노래제목 title\r\n"
			+ "    가수    artist\r\n"
			+ "    앨범제목 album\r\n"
			+ "    작곡가  composer\r\n"
			+ "    노래가 발표된 연도 year\r\n"
			+ "    노래가 속한 앨범에서의 트랙 번호를 나타내는 track\r\n"
			+ "\r\n"
			+ "   <메서드>\r\n"
			+ "    노래의 정보를 저장하는 setSongInfo(...) : 관련된 매개변수를 인자로 넘겨줌\r\n"
			+ "    노래의 정보를 나타내는 show()\r\n"
			+ "\r\n"
			+ "   <main 실행>\r\n"
			+ "    ABBA의 \"Dancing Queen\"노래를 Song객체로 생성하고\r\n"
			+ "    Show()로 출력하세요\r\n"
			+ "\r\n"
			+ "5. Rectangle클래스를 작성하세요\r\n"
			+ "   int타입의 x1, y1, x2, y2 : 사각형을 구성하는 두 점의 좌표\r\n"
			+ "   void set(int x1, int y1, int x2, int y2) : 좌표 설정\r\n"
			+ "   int square() : 사각형 넓이 리턴\r\n"
			+ "   void show() : 좌표와 넓이 등 직사각형 정보의 화면 출력\r\n"
			+ "   boolean equals(Rectangle r) : 인자로 전달된 객체 r과 현 객체가 동일한 좌표의 직사각형이면 true 리턴\r\n"
			+ "";
	
	System.out.println("\n\n\n------------------------------------");
	System.out.println(menuStr);
}

// 문제 번호를 선택하는 메서드
// sc 매개변수는 입력을 받기 위한 Scanner 객체를 전달받는 변수
public static int getSelectMenu(Scanner sc) {		
	
	System.out.print("\n\n 메뉴 선택 >> ");
	
	// 문자열 번호 -> 정수로 변환
	String strNum = sc.next();
	int num = Integer.parseInt(strNum);
	
	return num;
}

// 1번 문제에 대한 풀이
public static void answer1(Scanner sc) {

}

// 2번 문제에 대한 풀이
public static void answer2(Scanner sc) {
	/* 1) ChinaMain클래스에서 Scanner클래스와 China클래스의 객체를 생성한다
	 * 2) sc라는 Scanner클래스의 객체를 China클래스의 인스턴스 변수로 주게 된다.
	 * 3) China클래스에서 필드를 생성해주고 store_menu()메서드에서 for문을 이용하여 어떤 가게가 있나 출력
	 * 4) 중국집을 고르게 하기 위해서 sc.nextInt()를 이용해 가게 선택
	 * 5) 고른 가게에 대한 메소드로 이동시키고 각 가게마다의 메뉴 및 고르기까지 실행
	 */
}

// 3번 문제에 대한 풀이
public static void answer3(Scanner sc) {
	/*	1) MartMain 클래스에서 Mart클래스에 대한 객체 생성
	 *  2) Mart클래스에서 필드를 선언 후 buy()메소드를 통해 배 구매 로직 구현
	 *  3) MartMain 클래스에서 객체를 이용해 buy()메소드 실행
	 * */
}

// 4번 문제에 대한 풀이
public static void answer4(Scanner sc) {
	/*	1) 메인 파일에서 Song클래스에 대한 객체를 생성
	 *  2) Song파일에서 private로 필드 생성
	 *  3) 객체.setSongInfo()에서 인자값을 할당.
	 *  4) setSongInfo메소드를 통해 this생성자를 통해 인자값을 필드에 존재하는 인스턴스 변수에 값을 할당한다.(setter)
	 *  5) getter기능을 이용해 값들을 반환
	 *  6) 화면에 출력되기 위해 show메소드에 매개변수로 Song클래스의 객체를 주고 메소드 호출
	 * */
}

// 5번 문제에 대한 풀이
public static void answer5(Scanner sc) {
	/* 1) 메인메소드에서 x1, x2, y1, y2값 4개를 입력받아서 변수에 할당
	 * 2) set()메소드에 입력받은 값을 할당
	 * 3) Rectangle클래스에서 필드를 선언해주고 필드에 값을 할당해주는 메소드 생성(this()생성자 활용)
	 * 4) 사각형의 넓이와 화면에까지 보여주는 메소드 생성(this생성자를 이용해 필드값으로 계산)
	 * 5) 내가 입력한 값과 set()메소드를 이용한 값의 좌표가 일치할 경우 true를 출력하기 위해 boolean 자료형으로 생성.
	 * 6) 메인메서드에서 메서드 실행
	 * */
}

// 전체의 시작인 main 메서드
public static void main(String[] args) {
	
	/*Scanner를 생성/close()를 반복하면 Error가 발생하므로
	 * 객체를 1번 생성해놓고 메서드의 매개변수로 전달해서 사용하도록 한다
	 */
	Scanner sc = new Scanner(System.in);
	
	// isRun이 true면 반복이 계속되고, false면 반복문 탈출
	boolean isRun = true;
	
	while(isRun) {
		printMenu();			        // 메뉴 보여주기
		int selNum = getSelectMenu(sc); // 번호 선택하기
		
		switch(selNum) {
		case 1:
			answer1(sc);				// 1번문제해답
			break;
		case 2:
			answer2(sc);				// 2번문제해답
			break;
		case 3:
			answer3(sc);				// 3번문제해답
			break;
		case 4:
			answer4(sc);				// 4번문제해답
			break;
		case 5:
			answer5(sc);				// 5번문제해답
			break;
		case 6:
			isRun = false;				// 6번 탈출
			break;
		default:
			System.out.println("번호를 잘 못 입력했습니다.");
			break;
		}			
	}

	System.out.println("Program End~");
	
	// 키보드 입력을 받는 스트림 종료
	sc.close();
}
}





