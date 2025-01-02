package p6;

public class App {
	public static void main(String[] args){
		// 오버라이딩
		ㅊㅊㅊ 변수 = new ㅊㅊㅊ();
		AAA ref1 = new AAA();
		ref1.a = 10;
		ref1.testA();
		
		AAA ref2 = new BBB();	//다형성
		// 컴파일시 오버라이딩이 되어있으면 오버라이딩 메소드가 실행되고 안되어 있으면 원래 메소드가 실행됨
		ref2.testA();	// 상속
		
		
		
	}
	
}

class AAA{
	int a;
	
	public void testA() {
		System.out.println("AAA");
	}
}
class BBB extends AAA{
	int b;
	
	@Override
	public void testA() {
		System.out.println("Override AAA");
	}



	public void testB() {
		System.out.println("BBB");
	}
	
}

class ㅊㅊㅊ{
	int c;
}