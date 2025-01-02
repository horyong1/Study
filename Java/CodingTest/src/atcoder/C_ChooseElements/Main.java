package atcoder.C_ChooseElements;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int[] A = new int[N];
		int[] B = new int[N];
		
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		
		for(int i = 0; i < N; i++) {
			B[i] = sc.nextInt();
		}
		sc.close();
		
		
		boolean[] dpA = new boolean[N];
		boolean[] dpB = new boolean[N];
		
		// 첫번째 값은 항상 true로 시작
		dpA[0] = true;
		dpB[0] = true;
		
		for(int i = 1; i < N; i++) {
			// dpA[i] : X[i]를 A[i]로 선택할 수 있는가?
			if(dpA[i-1] && Math.abs(A[i -1] - A[i]) <= K) {
				dpA[i] = true;
			}
			if(dpB[i-1] && Math.abs(B[i -1] - A[i]) <= K) {
				dpA[i] = true;
			}
			// dpB[i] : X[i]를 B[i]로 선택 할 수 있는가?
			if(dpA[i-1] && Math.abs(A[i -1] - B[i]) <= K) {
				dpB[i] = true;
			}
			if(dpB[i-1] && Math.abs(B[i -1] - B[i]) <= K) {
				dpB[i] = true;
			}
		}
		
		if(dpA[N-1] || dpB[N-1]) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
			
		}
		
	}
}
