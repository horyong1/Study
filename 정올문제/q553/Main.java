package test553;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char tmp = 'A';
		int N =sc.nextInt();
		sc.close();
		
		for(int i = 0; i<N; i++) {
			for(int j = N; j>i; j--) {
				System.out.print(tmp);
				tmp++;
			}
		System.out.println();
		}	
	}	

}
