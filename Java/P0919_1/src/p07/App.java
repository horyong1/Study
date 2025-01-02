package p07;

public class App {
	public static void main(String[] args) {
		System.out.println("시작");
		
		AAA aaa = new AAA();
		aaa.value = 5;	// 속성 접근
		aaa.run();		// 메서드 호출!!
		
	}
}

class AAA{
	// 속성
	int value;
	
	// 기능(메서드) 문법 : 리턴타입 메서드명(매개변수){로직작성}
	// 메서드명 명명 규칙 : 카렘케이스 - 동사
	void run() {
		int a = 10; 
		int b = 20;
		System.out.println(a+b);
	}
}