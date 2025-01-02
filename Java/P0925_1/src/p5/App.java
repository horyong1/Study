package p5;

public class App {
	public  static void main(String[] args) {
		// [가장 중요한 표현] 다형성(polymorphism)
		// 다형성 = 상속 + 오버라이딩 + 다형성
		BBB ref1 = new BBB();	// 일반
		AAA ref2 = new AAA();	// 일반
		
		// 상속관계에 있을때 부모가 자식으로 인스턴스 생성 가능함(참조 변수의 타입이 부모면 자식부터 자손까지 가능함)
		// 다형성은 상속관계에 있을때만 가능함
		// 문법적인 타입은 AAA지만 실제론 BBB CCC DDD 일수 있다.
		AAA ref3 = new BBB();	// 다형성
		ref3 = new AAA();		// 일반
		ref3 = new BBB();		// 다형성
		ref3 = new CCC();		// 다형성
		ref3 = new DDD();		// 다형성
		
		DDD ref5 = new DDD();
		
		ref3.a = 10;
//		ref3.b = 10;			// 런타임시에는 메모리에 존재 하는데 문법으로는 접근이 불가함
		
		BBB ref4 = new BBB();
		ref4 = new CCC();
		ref4 = new DDD();
//		ref4 = new AAA();		// 자식이 부모는 안됨
		
		BBB a1 =(BBB)new AAA();
		BBB a2 = new BBB();
		
	}
}

class AAA {
	int a;
	
}

class BBB extends AAA{
	int b;

	
}

class CCC extends BBB{
	int c;
	
}

class DDD extends BBB{
	int d;
	
}

