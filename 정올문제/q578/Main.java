package test578;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();

		if (n1 < n2) {
			for (int i = n1; i <= n2; i++) {
				System.out.println("== " + i + "dan ==");
				for (int j = 1; j <= 9; j++) {
					System.out.printf("%d * %d = %2d\n", i, j, i * j);
				}
				System.out.println();
			}
		} else {
			for (int i = n2; i <= n1; i++) {
				System.out.println("== " + i + "dan ==");
				for (int j = 1; j <= 9; j++) {
					System.out.printf("%d * %d = %2d\n", i, j, i * j);
				}
				System.out.println();
			}

		}
	}

}
