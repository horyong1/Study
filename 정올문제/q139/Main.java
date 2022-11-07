package test139;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N1 = sc.nextInt();
		int N2 = sc.nextInt();
		sc.close();

		if (N1 >= N2) {
			for (int i = 1; i <= 9; i++) {
				for (int j = N1; j >= N2; j--) {
					System.out.printf("%d * %d = %2d   ", j, i, j * i);
				}
				System.out.println();
			}
		}else if(N1 <N2) {
			for (int i = 1; i <= 9; i++) {
				for (int j = N1; j <= N2; j++) {
					System.out.printf("%d * %d = %2d   ", j, i, j * i);
				}
				System.out.println();
			}
		}
	}
}
