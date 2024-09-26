package atcoder.A_Seismicmagnitudescales;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		
		int num = A-B;
		
		long energy = 1;
		
		if(A == B) {
			System.out.println(1);
			return;
		}
		
		
		for(int i = 0; i < num; i++) {
			energy *= 32;
		}
		
		System.out.println(energy);
	}

}
