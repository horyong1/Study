package test554;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int N = sc.nextInt();
		int num = 1;
		char ch = 'A';
		sc.close();
		for(int i = 0; i<N; i++) {
			for(int j = N; j>i; j--) {
				System.out.print(num+" ");
				num++;
			}
			for(int j = 0; j<=i; j++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}

}
