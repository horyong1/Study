package test137;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		
		for( int i  = 1; i<=num1; ++i) {
			for( int j  = 1; j<=num2; ++j) {
				System.out.print(i*j+" ");
			
			}
			System.out.println();
		}
	}

}
