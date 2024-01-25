package ch02.logicOperator07;

public class LogicOperator {

	public static void main(String[] args) {
		boolean logic;
		
		// and
		logic = true && true;
		System.out.println("true && true => "+ logic);
		
		logic = true && false;
		System.out.println("true && true => "+ logic);
		
		//or
		logic = true || true;
		System.out.println("true || true => "+ logic);
		
		logic = true || false;
		System.out.println("true || true => "+ logic);
		
		//Xor
		logic = true ^ true;
		System.out.println("true ^ true => "+ logic);
		
		logic = true ^ false;
		System.out.println("true ^ true => "+ logic);
		
		// not
		logic = !false;
		System.out.println("!false => "+ logic);
		
		logic = !true;
		System.out.println("!true => "+ logic);
	}

}
