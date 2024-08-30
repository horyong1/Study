package ch01;

/**
 * 기본타입(primitive type): 값저장
 * 논리타입(boolean(1)) : true, false
 * 문자(char(2)): 아스키코드 or 유니코드
 * 숫사
 * -정수:byte(1), short(2), int(4), long(8)
 * -실수: float(4), double(8)
 * */
public class Ex02_p83 {
	public static void main(String[] args) {
		// 타입 변수명=값;
		byte number = -128;
		// byte 값 허용범위 -128~127 까지 
		System.out.println(number);
		number = 127;
		System.out.println(number);
//		number = 128;//에러발생
		//Type mismatch: cannot convert from int to byte
		//타입 미스매치: 정수의 기본타입int에서 byte로 형변환을 할 수 없다
		
		number = (byte) 128;// 강제형변환 큰타입 -> 작은타입 데이터 손실 가능성있음
		System.out.println(number);
		
		double number2 = 3.14;
		System.out.println(number2);
		
		long number3 = 5;
		System.out.println(number3);
		
		int number4 = (int) number3;
		System.out.println(number4);//5
		System.out.println(number3 == number4);
		
		// number2의 변수값을 정수 기본형 타입의 변수에 저장하시오 
		int num = (int)number2;
		System.out.println(num);
		
		/**
		 * 자동타입변환 : 자동으로 타입변환이 일어나는것을 의미
		 * 작은 타입 -> 큰 타입 타입변환
		 * */
		byte number5 = 100;
		System.out.println("number5 값 : " + number5);
		int number6 = number5;
		System.out.println("number6 값 : " + number6);
		long number7 = number6;
		System.out.println("number7 값 : " + number7);
		
		System.out.println(number5 == number6);
		System.out.println(number5 == number7);

		
		float number8 = number5;
		System.out.println("number8 값 : " + number8);
		double number9 = number8;
		System.out.println("number9 값 : " + number9);
		
		
		
	}
}
