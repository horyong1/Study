package atcoder.A_Rounddecimals;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double X = sc.nextDouble();
		sc.close();
		
		String str = String.valueOf(X);
		String[] str2 = str.split("\\.");
		
		if(str2[1].charAt(0) >= '5') {
			int roundValue = Integer.parseInt(str2[0]) + 1;
			System.out.println(roundValue);
		}else {
			System.out.println(str2[0]);
			
		}
				
//		System.out.println(Math.round(X));
	}
}
