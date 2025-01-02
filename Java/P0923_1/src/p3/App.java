package p3;

public class App {

	public static void main(String[] args) {
		new Test().test1();
	}

}

class Test {

	public void test1() {
		System.out.println("test1 - 초반 로직....");
		test2();
		System.out.println("test1 - 후반 로직....");
	}

	public void test2() {
		System.out.println("test2 - 초반 로직....");
		test3();
		System.out.println("test2 - 후반 로직....");
	}

	public void test3() {
		System.out.println("test3 - 초반 로직....");
		test4();
		System.out.println("test3 - 후반 로직....");
	}

	public void test4() {
		System.out.println("test4 - 초반 로직....");

		System.out.println("test4 - 후반 로직....");
	}
}
