package pro01;

import java.util.ArrayList;
import java.util.List;

public class SubwayList {
	protected String userInput;
	private int choice_subway;

	public SubwayList(int choice_subway) {
		this.choice_subway = choice_subway;
	}

	public List<String> getList() {
		if (this.choice_subway==2) {
			return Line_two();
		}
		
		else if(this.choice_subway==3) {
			return Line_three();
		}
		else if(this.choice_subway==4) {
			return Line_four();
		}
		
		return null;
		
	}

	public List<String> Line_two() {
		List<String> subwaylist2 = new ArrayList<>();

		subwaylist2.add("강남");
		subwaylist2.add("역삼");
		subwaylist2.add("신림");
		subwaylist2.add("신대방");
		subwaylist2.add("동대문역사문화공원");
		int size = subwaylist2.size();
		System.out.println("등록된 2호선 개수 : " + size);

		return subwaylist2;
	}

	public List<String> Line_three() {
		List<String> subwaylist3 = new ArrayList<>();

		subwaylist3.add("종로3가");
		subwaylist3.add("을지로3가");
		subwaylist3.add("충무로");
		subwaylist3.add("수서");
		subwaylist3.add("가락시장");
		subwaylist3.add("대화역");
		int size = subwaylist3.size();
		System.out.println("등록된 3호선 개수 : " + size);

		return subwaylist3;
	}

	public List<String> Line_four() {
		List<String> subwaylist4 = new ArrayList<>();

		subwaylist4.add("미아사거리");
		subwaylist4.add("혜화");
		subwaylist4.add("동대문");
		subwaylist4.add("회현");
		subwaylist4.add("정왕역");
		subwaylist4.add("안산역");
		subwaylist4.add("범계역");
		int size = subwaylist4.size();
		System.out.println("등록된 4호선 개수 : " + size);

		return subwaylist4;
	}
}