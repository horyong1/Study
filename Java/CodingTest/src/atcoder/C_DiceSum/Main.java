package atcoder.C_DiceSum;

import java.util.Scanner;

public class Main {
	private static final int MOD = 998244353;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		
		long[][] dp = new long[N+1][K+1];
		dp[0][0] = 1;
		
		for(int i = 1; i <= N; i++ ) {
			for(int j = 0; j <= K; j++) {
				for(int x = 1; x <= M; x++) {
					if(j - x >= 0) {
						dp[i][j] = (dp[i][j] + dp[i-1][j-x]) % MOD;
					}
				}
			}
		}
		long result = 0;
		for(int j = 0; j <= K; j++) {
			result = (result + dp[N][j]) % MOD;
		}
		
		System.out.println(result);
	}
}

