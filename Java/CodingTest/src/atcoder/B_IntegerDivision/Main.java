package atcoder.B_IntegerDivision;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long X = sc.nextLong();
		sc.close();
		
		long quotient = X / 10;
		long remainder = X % 10;
		
		if( X < 0 && remainder != 0) {
			System.out.println(quotient -1 );
		}else {
			System.out.println(quotient);
		}
	}
}
