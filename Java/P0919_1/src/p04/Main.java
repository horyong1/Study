package p04;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AAA a = new AAA();
		a.v1 = 10;
		
		a.v3 = new BBB() ;
		a.v3.q1 = 20;
		
		System.out.println(a.v1);
		System.out.println(a.v3.q1);
		
		
	}

}

class AAA{
	int v1;
	int v2;
	BBB v3 = new BBB();
	
	
}

class BBB{
	int q1;
	int q2;
}