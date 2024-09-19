package p08;

public class Main {
	public static void main(String[] args) {
		AAA aaa = new AAA();
		
		aaa.test1(1,2);
		aaa.test2();
	}
}

class AAA{
	int value;
	
	void test1(int q, int pppp) {
		System.out.println("값을 더합니다. 라는 로직....");
	}

	void test2() {
		System.out.println("값을 곱합니다. 라는 로직....");
		
	}
}