package p2;

public class App {

	public static void main(String[] args) {
		// static
		AAA ref1 = new AAA();
		AAA ref2 = new AAA();
		ref1.a = 10;
		ref2.a = 20;
		AAA.a = 30;
		
		System.out.println(ref1.a);
		System.out.println(ref2.a);
		
		
	}

}

class AAA{
	// static(정적)은 메모리 영역중 메소드 영역에 적재되고 프로그램 시작과 함께 생성되서 종료될때까지 존재한다
	// static 같은 클래스 안에서는 값을 공유한다. 왜냐하면 static 변수는 오로지 1개 이기 때문에
	// 메소드 영역에 클래스를 저장하는 공간이 있음. 클래스명.a 로 접근이 가능함 
	static int a = 0; // 인스턴스 생성과 상관없이 존재함. 1개 
	int b = 0;
	int c = 0;
}
