package ch09.extends01;

public class Father extends GrandFather {

	void wealth() {
		System.out.println("돈을 많이 벌었다.");
		GrandFather g = new GrandFather();
		g.handsome();
	}
	void handsome() {
		System.out.println("사실 못생긴듯");
	}

}
