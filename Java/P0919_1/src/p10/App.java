package p10;

public class App {
	public static void main(String[] args) {
			Calculator calculator = new Calculator();
			int plus1 = calculator.plus(10, 20);
			int plus2 = calculator.plus(30, 55);
			System.out.println(plus1);
			System.out.println(plus2);
			
			calculator.plus(plus1, plus2);
			
			
	}
}

class Calculator{
	
	/**
	 * a + b 더하는 메소드
	 * @param int a  값
	 * @param int b  값
	 * */
	int plus(int a , int b) {
		int result = a + b;
		return result;
	}
	/**
	 * a - b 더하는 메소드
	 * @param int a  값
	 * @param int b  값
	 * */
	int minus(int a, int b) {
		int result = a - b;
		return result;
	}
	
}
