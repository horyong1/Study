package atcoder.A_Horizon;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		sc.close();
		
		long l = 1000000000000000000L;
		l = 12800000+x;
		l *= x;
		
		double result4 = Math.sqrt(l);

		System.out.println(result4);
	}
}
