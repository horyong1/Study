package B_StarorNot;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] arr = new int[N - 1][2];

		for (int i = 0; i < N - 1; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();

		}
		sc.close();
		
		int[] degree = new int[N + 1];
		for (int i = 0; i < N - 1; i++) {
			degree[arr[i][0]]++;
			degree[arr[i][1]]++;
		}
		
		boolean isStar = false;
		
		for(int i = 1; i <= N; i++) {
			if(degree[i] == N -1) {
				isStar = true;
				break;
			}
		}
		System.out.println(isStar ? "Yes" : "No");

	}
}
