package p01;

public class Main {
	public static void main(String[] args) {
		// 클래스 기초 
		// 클래스 선언, 참조변수 및 인스턴스 생성
		// 접근 연산자 . 으로 접근해서 활용
		
		AAA a = new AAA();
		BBB b = new BBB();
		
		a.v1 = 12;
		b.q2 = 12.4;
		
		System.out.println(a.v1);
		System.out.println(b.q2);
		
		
	}
}


// VO ( Value Object), DTO(Data Transfer Object)
class AAA{
	int v1;
	int v2;
}



class BBB{
	double q1;
	double q2;
	
}
