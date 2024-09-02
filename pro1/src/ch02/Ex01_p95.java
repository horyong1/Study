package ch02;

/**
 * 정수 : byte(1), short(2), int(4), long(8)
 * 실수 : float(4), double(8)
 * 문자 : char(2)
 * 논리 : boolean(true, false)
 * 
 * -byte short int float long double *
 * 
 * 자동 타입변환 : 작은 타입에서 큰 타입으로 연산을 수행할때 큰타입으로 변환되는 방법
 * 			 작은 타입 -> 큰 타입 
 * 강제 타입변환 :  큰 타입에서 작은 타입으로 강제로 나눠서 저장하는 방법
 * 			 (작은타입) 큰 타입 -> 작은 타입 
 */

public class Ex01_p95 {
	public static void main(String[] args) {
		// 정수타입의 변수 n1 초기값 100 선언
		// 실수 타입의 변수 n2 할당 
		// 초기값 3.14 선언
		
		long n1 = 100;
		System.out.println(n1);
		
		double n2;
		n2 = 3.14;
		System.out.println("n2 = " + n2);
		n2 = n1; // long 타입의 변수 n1의 값이 double 변수 n2에 저장
		System.out.println("n2 = " + n2);
		
//===================================================
		
		int n3 = 500; // 4byte
		long n7 = 500000000000L; // 리터럴 형 변환 
		float n4 = (float)3.14;	// 강제 형 변환
		float n5 = 3.14f; // 리터럴 형 변환
		double n6 = 3.14d;// 리터럴 형 변환 double은 d 안적어도 됨
		
//===================================================
		int a1 = 123;
		// long타입변수 a2에 3.14 저장 
		long a2 = (long)3.14;
		System.out.println("a1 = " + a1); //123
		System.out.println("(long)a2 3.14결과 = " + a2); //3
		
	}
}
