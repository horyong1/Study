package p03;

public class Main {
	public static void main(String[] args) {
		AAA a1 = new AAA();
		AAA a2 = new AAA();
		AAA a3 = new AAA();
		
		System.out.println(a1.v1);
		System.out.println(a2.v1);
		System.out.println(a3.v1);
	}
}

class AAA{
	int v1 = 30;
	String v2 = "안녕";
	boolean v3 = true;
}
