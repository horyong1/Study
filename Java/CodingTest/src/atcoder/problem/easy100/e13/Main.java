package atcoder.problem.easy100.e13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.close();
		
		int count = 0;
		
		 if (A % 2 == 1 || B % 2 == 1 || C % 2 == 1) {
	            System.out.println(0);
	            return;
	        }
		
		while (true) {
			if (A % 2 == 1 || B % 2 == 1 || C % 2 == 1) {
                System.out.println(count);
                return;
            }
			
			if(A == B && B == C) {
				System.out.println(-1);
				return;
			}
			
			int newA = (B / 2) + (C / 2);
			int newB = (A / 2) + (C / 2);
			int newC = (A / 2) + (B / 2);
			
			A = newA;
			B = newB;
			C = newC;
			
			count++;
			
		}
		 
	}
}
