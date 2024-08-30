package ch02;

/**
 * 기본타입: 값 저장
 * 정수 : byte(1), short(2), int(4), long(8) 
 * 실수 : float(4), double(8)
 * 논리값 : boolean (true, false)
 * 문자 : char(2) 아스키코드 or 유니코드 (c언어와 호환용)
 * */

// 정수 연산에서의 자동 타입 변환
public class Ex01_p98 {
	public static void main(String[] main) {
//		int result2; // 변수선언문법 > 타입 변수명;
		int num1 = 10;
		int num2 = 2;
		int num3 = 3;
		
		int result1 = num1/num2;
		System.out.println(result1); //5
		
		result1 = num1%num2;
		System.out.println(result1); //0
		
		result1 = num1%num3;
		System.out.println(result1); //1
		
		
		
		long num4 = 40;
		long num5 = 50;
		long result2 = 0;
//		float result2 = num4 + num5;// long+long float 자동 타입변환
//		double result2 = num4 + num5;// double 자동타입변환 
//		long result2 = 0;
		result2 = num4 + num5;
		
		System.out.println(result2); //90
		
		
		byte num6 = 10;
		short num7 = 9;
		
		int result3 = num6 * num7;
		System.out.println("byte * short의 결과 : " + result3);
		long result4 = num6 * num7;
		System.out.println("byte * short의 결과 : " + result4);
		
		
		char c1 = 'A';
		int i1 = 10;
		System.out.println("c1 + i1의 결과 = " + (int)(c1+i1));
		
	}
}
