package ch09.resolve14.resolve2;

public class TableTester {
	private final int TEST_NUM = 3;
	private ITable it;

	public TableTester() {
		
	}
	public TableTester(ITable it) { // 생성자에 인자값을 넣었을때
		this.it = it;
	}
	public void setItable(ITable it) { // setter로 값 할당
		this.it = it;
	}
	
	
	public int screenTest() throws InterruptedException { // 상영시간
		for(int i=0; i < TEST_NUM; i++) {
			it.movie();
			it.movie();
		}
		return (int)(Math.random()*50) + 50;
	}
	public int soundQualityTest() throws InterruptedException { // 음악 길이
		for(int i=0; i < TEST_NUM; i++) {
			it.music();
			it.music();
		}
		return (int)(Math.random()*50) + 50;
	}
	public int dictionTest() throws InterruptedException { // 강도 테스트
		for(int i=0; i < TEST_NUM; i++) {
			it.readBook();
			it.readBook();
		}
		return (int)(Math.random()*50) + 50;
	}
	public int totalTest() throws InterruptedException {
		for(int i=0; i < TEST_NUM; i++) {
			it.movie();
			it.music();
			it.readBook();
			it.movie();
			it.music();
			it.readBook();
		}
		return (int)(Math.random()*50) + 50;
	}
}
