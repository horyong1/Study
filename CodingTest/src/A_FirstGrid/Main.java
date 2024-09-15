package A_FirstGrid;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		String[] grid = {sc.next(),sc.next()};
		sc.close();
		
		boolean match = (grid[0].charAt(0) == grid[0].charAt(1)) ||
						(grid[1].charAt(0) == grid[1].charAt(1)) ||
						(grid[0].charAt(0) == grid[1].charAt(0)) ||
						(grid[1].charAt(0) == grid[1].charAt(1));
				
		System.out.println(match ? "Yes" : "No");
//		String S1 = sc.next();
//		String S2 = sc.next();
//		sc.close();
//		
//		if(S1.charAt(0) == S1.charAt(1)) {
//			System.out.println("Yes");
//			return;
//		}
//		
//		if(S2.charAt(0) == S2.charAt(1)) {
//			System.out.println("Yes");
//			return;
//		}
//		
//		if(S1.charAt(0) == S2.charAt(0)) {
//			System.out.println("Yes");
//			return;
//		}
//		
//		if(S1.charAt(1) == S2.charAt(1)) {
//			System.out.println("Yes");
//			return;
//		}
//		
//		
//		
//		System.out.println("No");
	}

}
