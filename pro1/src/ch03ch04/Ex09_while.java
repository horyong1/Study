package ch03ch04;

/**
 * 중첩 while 문 while(조건){ 실행 코드 반복 }
 */
public class Ex09_while {
	public static void main(String[] args) {
		int a = 1;
		System.out.println("====== 1~5 출력 =======");
		while (a <= 5) {
			System.out.println(a);
			a++;
		}

		a = 1;
		int sum = 0;
		System.out.println("======= 1~5 더하기 ========");
		while (a <= 5) {

			sum += a;
			a++;
		}
		System.out.println(sum);
	}
}
