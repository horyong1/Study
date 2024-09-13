package A_NotOverflow;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		long N = sc.nextLong();
		sc.close();
		
		long A = (long) Math.pow(2, 63) - 1;
		long B = (long) Math.pow(2, 63) * (-1);
		if(A >= N && N >= B) {
			System.out.println("No");
			return;
		}
		
		long pulsL = (long) Math.pow(2, 31) - 1;
		long minusL = (long) Math.pow(2, 31) * (-1);

		if(N >= minusL && N <= pulsL) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
