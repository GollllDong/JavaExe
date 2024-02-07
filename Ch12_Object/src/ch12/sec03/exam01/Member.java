package ch12.sec03.exam01;

// java의 모든 클래스의 초상위 부모는 Object 클래스가 된다.

public class Member {
	public String id;

	public Member(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member target) {	// obj가 Member에 속해있다면 Member에 속해있는 target으로 변환해라
			if (id.equals(target.id)) {
				return true;
			}
		}
		return false;
	}

}
