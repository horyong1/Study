package p1;

public class App {
	public static void main(String[] args) {
		// 상속, 다형성(중요), 오버라이딩
		AAA ref = new BBB();
		ref.test();
		
	}
}

class AAA{
	int a;
	
	void test() {
		System.out.println("A");
	}
}

class BBB extends AAA{
	int b;
	
	void test() {
		System.out.println("B");
		
	}
}

class CCC extends BBB{
	int c;
}