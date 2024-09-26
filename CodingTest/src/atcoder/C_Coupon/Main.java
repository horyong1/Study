package atcoder.C_Coupon;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int X = sc.nextInt();
		
		int[] prices = new int[N];
		
		for(int i = 0; i < N; i++) {
			prices[i] = sc.nextInt();
		}
		sc.close();
		
//		for(int i = 0; i < N-1; i++ ) {
//			for(int j = i+1; j < N; j++ ) {
//				if(prices[i] < prices[j] ) {
//					long temp = prices[i];
//					prices[i] = prices[j];
//					prices[j] = temp;
//				}
//			}
//		}
		
		Arrays.sort(prices);

		for(int i = N-1; i >= 0; i--) {
			int couponUse = Math.min(prices[i]/X, K);
			prices[i] -= couponUse * X;  // 쿠폰 사용 후 아이템 가격 갱신
            K -= couponUse;
		
		}
		
		// 남은 쿠폰이 있으면 가장 비싼 아이템에 추가로 사용
		Arrays.sort(prices);// 다시 가격을 정렬하여 비싼 아이템에 쿠폰 적용
		for(int i = N-1; i >= 0 && K > 0; i--) {
			prices[i] = Math.max(prices[i] - X, 0); // 가격이 0 미만이 되지 않도록 처리
			K--;
		}
		
		long result = 0;
		for(int A : prices) {
			result += A;
		}
		
		System.out.println(result);
		
		
	}

}
