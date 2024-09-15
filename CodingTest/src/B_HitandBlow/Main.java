package B_HitandBlow;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		for(int i = 0; i < N; i++) {
			B[i] = sc.nextInt();
		}
		sc.close();
		
		int strike = 0;
		int ball = 0;
		for(int i = 0; i < N; i++) {
			if(A[i] == B[i]) {
				strike++;
			}
			for(int j = 0; j < N; j++) {
				if(i != j) {
					if(A[i] == B[j]) {
						ball++;
					}
				}
			}
		}
		
		System.out.println(strike);
		System.out.println(ball);
	}

}
