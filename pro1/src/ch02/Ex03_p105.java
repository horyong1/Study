package ch02;

/**
 * 문자열을 기본 타입으로 강제 타입 변환
 * */
public class Ex03_p105 {
	public static void main(String[] args) {
		String str = "100";
		System.out.println("str :::: " + str);
		System.out.println(str + 1); //1001
		// +는 문자열 연결연산자이다
		// "100" + "1" => "1001"
		
		// String -> int: Integer.parseInt(문자열값)
		int num1 = Integer.parseInt(str);
		System.out.println(num1 + 1);
		
		// short = int : int -> short (short)
		short num2 = (short)(Integer.parseInt(str)+1);
		System.out.println(num2);
		
		// float 가 더 큼으로 Integer.parseInt(str) 해도 자동 형변환됨
//		float num3 = Integer.parseInt(str)+1;
		float num3 = Float.parseFloat(str)+1;
		System.out.println(num3); // 101.0
		
	}
}
