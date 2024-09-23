package ch03ch04;
/**
 * 아래와 같은 출력 형태가 나오도록 하시오.
 * 구구단 5단
 * */
public class Ex08_for_gugudan {
	public static void main(String[] args) {
		int n1 = 5;
		
//		for(int i = 1; i<10; i++) {
//			System.out.printf("%d * %d = %d\n", n1,i,n1*i);
//			
//		}
		
		//2단 ~ 9단
		for(int i = 2; i<10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d\n", i,j,j*i);
			}
			System.out.println("=============");
			
		}
		
		
	}
}
