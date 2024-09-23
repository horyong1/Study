package ch03ch04;


public class Ex06_for {
	public static void main(String[] args) {
		//1~5 출력
		
		for(int i = 1; i <= 5; i ++) {
			System.out.println(i);
		}
		
		System.out.println("================");
		//5~1
		for(int i = 5; i >= 1; i --) {
			System.out.println(i);
		}
		
		System.out.println("================");
		for(int i = 5; i >= 1; i=i-2 ) {
			System.out.println(i);
		}
	}
}
