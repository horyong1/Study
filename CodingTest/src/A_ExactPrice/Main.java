package A_ExactPrice;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		sc.close();
		
		if( X == 0) {
			System.out.println("No");
			return;
		}
		
		if(X % 100 == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
			
		}
	}

}
