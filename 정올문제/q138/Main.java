package test138;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		for(int i = 0; i<N; i++) {
			for(int j = 0; j<N; j++) {
				System.out.printf("(%d, %d) ",i+1,j+1);
				
			}
			System.out.println();
		}

	}

}
