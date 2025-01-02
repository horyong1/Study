package p5;

public class App {

	public static void main(String[] args) {
		System.out.println("야호1");
		System.out.println("야호2");
		System.out.println("야호3");
		
		int sum = 0;
		for(int i = 0 ; i < 10; i++) {
			sum += i;
		}
		
		System.out.println(sum);
		System.out.println("야호4");
		
		AAA a = new AAA();
		a.test();
		
		System.out.println("야호5");
		System.out.println("집에가자");
	}

}

class AAA{
	public void test() {
		System.out.println("졸려1");
		System.out.println("졸려2");
		System.out.println("졸려3");
	}
}