package test1307;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char N = 'A';
		int num = sc.nextInt();
		sc.close();
		
		char[][] arr = new char[num][num];


		for (int i = num - 1; i >= 0; i--) {
			for (int j = num - 1; j >= 0; j--) {
				if (N > 'Z')
					N = 'A';
				arr[j][i] = N++;
			}
		}
		
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.print(arr[i][j] + " ");

			}
			System.out.println();
		}

	}

}
