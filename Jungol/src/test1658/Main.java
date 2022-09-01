package test1658;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();
		
		int gcd=0, lcm=0;

		for(int i = 1; i<=n1; i++) {
			if(n1%i==0 && n2%i==0) {
				gcd=i;
			}
		}
		
		lcm = (n1*n2) / gcd;
		
		System.out.println(gcd);
		System.out.println(lcm);
	}

}
