package ch02;

/**
 * 변수 출력 방법 
 * */
public class Ex04_p112 {
	public static void main(String[] args) {
		int value = 123;
		String str = "살";
		double d = 2245.23;
//		System.out.println(value); 	// 내용 출력하고 줄바
//		System.out.print(value); 	// 내용만 출력
		// 가변 출력 원하는 만큼 출력가능
		System.out.printf("%d %s\n", value, str );
		System.out.printf("%d\n",value);	// 정수
		System.out.printf("%5d\n",value);	// 5자리정수
		// 왼쪽 비어 있는 자리에 공백을 넣어 10자리 채움
		System.out.printf("%10d\n",value);	
		// -는 오른쪾 비어 있는 자리에 공백을 넣어 10자리 채움 
		System.out.printf("%-10d\n",value);
		System.out.printf("%5.2f",d);
		
		
	}
}
