package A_Tires;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		sc.close();
		
		int N = str.length();
		if(str.charAt(N-1) == 'r') {
			System.out.println("er");
		}else {
			System.out.println("ist");
			
		}
	}
}
