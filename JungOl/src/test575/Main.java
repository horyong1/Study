package test575;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		int sum=1;
		for(int i=0; i<num2; i++ ) {
			if(num2==0) {
				sum=1;
				break;
			}
			sum*=num1;
		}
		System.out.println(sum);

	}

}
