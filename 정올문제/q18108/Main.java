package test18108;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();

		if (n1 >= 0) {
			if (n2 >= 0) {
				System.out.println(1);
			} else {
				System.out.println(4);
			}
		} else {

			if (n2 >= 0) {
				System.out.println(2);

			} else {
				System.out.println(3);

			}
		}
	}
}
