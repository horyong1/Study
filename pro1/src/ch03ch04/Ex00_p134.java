package ch03ch04;

/**
 * 증감 연산자(++) : 피연산자의 값을 1증가 시킴
 * 감소 연산자(--) : 피연산자의 값을 1감소 시킴
 * 전위형 i++	값이 참조 되기전에 증가
 * 후위형	++i 값이 참조 된 후에 증가
 * */
public class Ex00_p134 {
	public static void main(String[] args) {
		int x = 10;
		int y = 50;
		int z;
		System.out.println("초기x 값 : " + x);//10	
		System.out.println("초기y 값 : " + y);//50	
	
		System.out.println("x++ 값 : " + x++);//10
		System.out.println("x   값 : " + x);//11
		System.out.println("y-- 값 : " + y--);//50
		System.out.println("y   값 : " + y);//49
		
		System.out.println("++x 값 : " + ++x);//12
		
		z=++x;
		System.out.println("z   값 : " + x);//13
		
	}
}	
