package ch02;
/**
 * char타입(p85)
 * 하나의 문자를 작은따옴표('')로 감싼 것을 문자 리터럴이라고 한다.
 * 문자 리터럴은 유니코드로 변환되어 저장된다.
 * 유니코드는 세계 각국의 문자를 2byte로 표현할 수 있는 숫자(0~65535)
 * 'A' 'a' '1' '가' '호' 
 * */
public class Ex00_85 {
	public static void main(String[] args) {
		char c1 = 'A';
		System.out.println("c1애 저장된 A = " + c1);
		int n1 = c1;
		System.out.println("유니코드 값 : " + n1);//65
		System.out.println("변수 n1 = " + (char)n1);//A
		
		c1 = (char)n1;
		System.out.println(c1);
		
		char c2 = 'a';
		System.out.println("c2애 저장된 a = " + c2);
		int n2 = c2;
		System.out.println("유니코드 값 : " + n2);//97
		
		
		char c3 = '1';
		System.out.println("c3애 저장된 1 = " + c3);
		int n3 = c3;
		System.out.println("유니코드 값 : " + n3);//49

		
		char c4 = '가';
		System.out.println("c4애 저장된 가 = " + c4);
		int n4 = c4;
		System.out.println("유니코드 값 : " + n4);//44032
		
		
		char c5 = '호';
		System.out.println("c5애 저장된 호 = " + c5);
		int n5 = c5;
		System.out.println("유니코드 값 : " + n5);//54840
		
	}
}
