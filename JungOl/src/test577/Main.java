package test577;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		sc.close();
		if(num1>num2) {
			int N = num1/2;
			int N2 = num2*2;
			System.out.println(N+" "+N2);
		}else {
			int N = num1*2;
			int N2 = num2/2;
			
			System.out.println(N+" "+N2);
		}
		
	}

}
