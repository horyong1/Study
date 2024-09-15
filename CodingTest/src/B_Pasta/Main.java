package B_Pasta;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();	// 파스타 면 개수
		int M = sc.nextInt();	// 식사 계획 일수
		int[] A = new int[N];
		int[] B = new int[M];
		
		for(int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
		}

		for(int i = 0; i < B.length; i++) {
			B[i] = sc.nextInt();
		}
		sc.close();
		
		int cnt = 0;
		for(int i = 0; i < B.length; i++) {
			for(int j = 0; j < A.length; j++) {
				if(B[i] == A[j]) {
					A[j] = 0;
					cnt++;
					break;
				}
			}
		}
		if(cnt == M) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}

}
