package A_WaterPressure;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		sc.close();
		
		double pascal = (double)x/100; 
		
		System.out.println(pascal);
	}

}
