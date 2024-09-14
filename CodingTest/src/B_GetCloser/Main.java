package B_GetCloser;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		
		double C =  Math.sqrt((double)(A*A) + (B*B));
		
		System.out.println((double)A/C + " " + (double)B/C);
		
	}
}
