package ch02;
/**
 * 변수 사용 범위 - 지역변수, 전역변수 
 * 지격변수(variable)-()
 *  - 중괄호 {} block 내에서 선언되고 사용 
 *  - ()내에서 선언되고 중괄호 {} block내에서 사용 
 * 참고>전역변수(global variable)
 * 
 * */
public class Ex0_p76 {
	static int a;	// 전역변수 a를 선언함과 자동 초기화 0
	static double b;
	public static void main(String[] args) {
		// 지역변수는 반드시 초기화해야한다 
//		int a = 100;	// a라는 이름의 지역변수를 선언 
		System.out.println(a);
		
		a=10;	
		if(a == 10) {
			System.out.println("a는 10과 동일하다.");
			a=100;
			System.out.println("if믄 안의 a = " + a);
			
			b = 3.14;
			System.out.println("if문 안의 b = " + b);
		}else {
			System.out.println("a는 10과 동일하지 않다.");	
		}
		b = 31.4;
		System.out.println("if문 밖의 b = " + b);
		a=11; 
		System.out.println("if문 밖 a = " + a); // 11
		
		System.out.println(args[0]);
		args[0] = "아무내용";
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
	}
}
