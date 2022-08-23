package test1304;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		for(int i=1; i<=num; i++) {
			int n=i;
			for(int j = 0; j<num; j++) {
				System.out.print(n+" ");
				n+=num;
			}
			System.out.println();
		}
	}

}
