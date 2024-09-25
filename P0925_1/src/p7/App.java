package p7;

public class App {

	public static void main(String[] args) {
		
		AAA ref = new BBB();
		ref = new CCC();
		ref.method1();
		ref.method2();
		
		
	}

}

class AAA{
	void method1() {
		System.out.println("AAA - method1");
	}
	
	void method2() {
		System.out.println("AAA - method2");
		
	}
}

class BBB extends AAA{

	@Override
	void method1() {
		System.out.println("BBB - Override method1");
		
	}
	
}

class CCC extends BBB{

	@Override
	void method1() {
		System.out.println("CCC - Override method1");
	}
	
}