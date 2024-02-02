package ch09.resolve14.resolve2;

public class ITableMain {
	// ITableMain에서 ITable의 객체를 생성하고
	// ITable의 객체를 이용하여 각 파일의 메소드들 호출
	public static void main(String[] args) throws InterruptedException {
		TableTester tester = new TableTester();
		ITable[] product = new ITable[] { new SamSung(), new Sony(), new LG() };
		int[] score = new int[product.length];

		for (int i = 0; i < product.length; i++) {
			tester.setItable(product[i]);
			score[i] += tester.screenTest();
			System.out.println("1) 화면 테스트 :" + score[i] + "점 입니다.");

			score[i] += tester.soundQualityTest();
			System.out.println("2) 음향 테스트 : " + score[i] + "점 입니다.");

			score[i] += tester.dictionTest();
			System.out.println("3) 발음 테스트 :  " + score[i] + "점 입니다.");

			score[i] += tester.totalTest();
			System.out.println("4) 확인 테스트 :  " + score[i] + "점 입니다.");
		}
		int max = score[0];
		int maxIdx = 0;
		for (int i = 0; i < score.length; i++) {
			if (max < score[i]) {
				max = score[i];
				maxIdx = i;
			}
		}
		System.out.printf("가장 높은 점수를 받은 제품의 회사는 %d번째 회사이며 점수는 %d점 입니다.\n", maxIdx + 1, max);
		System.out.println(product[maxIdx].getClass().getName());
	}
}
