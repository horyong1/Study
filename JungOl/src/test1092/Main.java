package test1092;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		long x = sc.nextInt();
		long y = sc.nextInt();
		sc.close();
		
		if(x==0 || y==0) {
			System.out.println(1);
			System.exit(0);
		}
		
		long sum = x;
		for(int i =1; i<=y; i++) {
			
			sum = sum * x; 
		}
		long sum2 = sum%20091024;
		
		System.out.println(sum2);
	}

}
