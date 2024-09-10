package Q05;

public class Main {
	public static void main(String[] args) {
		int sum1 = 0;
		int sum2 = 0;
		for(int i = 1; i <= 10; i ++) {
			sum1 += i;
			sum2 += sum1;
			
		}
		System.out.println(sum2);
		
//		//삼각수공식을 이용한 풀이
//		int sum = 0;
//		for(int n =1; n <= 10; n++) {
//			sum = (n * (n + 1)) / 2;
//		}
//		System.out.println(sum);
		
//		//별찍기 for문 방법
//		int sum = 0;
//		for(int x = 1; x <= 10; x++) {
//			for(int y = x; y <= x; y++) {
//				sum += y;
//			}
//		}
//		System.out.println(sum);

	}
}
