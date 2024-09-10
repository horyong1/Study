package Q15;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		sc.close();
		
		int cnt = 0;
		while(N>=K) {
			
			if(N % K != 0) {
				int target = (N / K) * K;
				cnt = N -target;
				N = target;
				System.out.println(N);
			}
			N = N/ K;
			System.out.println(N);
			cnt ++;
		}
//		while (N > 1) {
//			
//			if(N % K == 0) {
//				N /=  K ;
//				cnt++;
//				System.out.println(N);
//			}else {
//				N -= 1;
//				cnt++;
//				System.out.println(N);
//				
//			}
//		}
		System.out.println(cnt);

	}
}
