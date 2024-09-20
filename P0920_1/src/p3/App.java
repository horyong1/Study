package p3;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 19;
		new AAA().run(19);
	}

}

class AAA{
	void run(int a) {
		System.out.println("AAA - run 호출됨");
		new BBB().run(a);
	}
}

class BBB{
	void run(int a) {
		System.out.println("BBB - run 호출됨 param :: " + a);
	}
}

class Data{
	// static은 메소드 영역에 있기 때문에 초기화를 해줘야 한다.
	static int value = 10;
}
