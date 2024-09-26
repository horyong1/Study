package p3;

public class App {

	public static void main(String[] args) {
		// 상속 + 다형성 + 오버라이딩 + 추상 = 인터페이스 (자바의 꽃)
		Test a = new AAA();
		a.method1();
		
		
		Test b = new BBB();
		b.method1();
	}

}
// 인터페이스를 선언한다 = 메서드 표준을 정의한다.
interface Test{
	int a = 0;	// public static final 이 붙어 있음
	// 인터페이스 메소드는 일반적으로 abstract로 되어 있어 생략하고 작성해도 abstract로 메소드가 생성됨
	// 인터페이스에서 메소드는 무조건 public으로 만들어야함
//	public abstract void method1(); // 2개 다 사용 가능
//	void method3();
	public void method1();
	public void method2();
	public void method3();
}

class AAA implements Test{

	public void method1() {
		System.out.println("AAA method1");
	}

	public void method2() {
		System.out.println("AAA method2");
	}
	
	public void method3() {
		System.out.println("AAA method3");
	}
	
}

class BBB implements Test{

	public void method1() {
		System.out.println("BBB method1");
	}

	public void method2() {
		System.out.println("BBB method2");
	}

	public void method3() {
		System.out.println("BBB method3");
	}
	
}
