package test1523;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		if(!((n1>=0&&n1<=100)&&(n2>=1&&n2<=3))) {
			System.out.print("INPUT ERROR!");
			sc.close();
			System.exit(0);
			
		}
		
		switch(n2) {
		case 1:
			for(int i = 0; i<n1; i++) {
				for(int j = 0; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			break;
		case 2:
			for(int i = 0; i<n1; i++) {
				for(int j = n1; j>i; j--) {
					System.out.print("*");
					
				}
				System.out.println();
			}
			break;
		case 3:
			for(int i = 0; i<n1; i++) {
				for(int j = n1-1; j>i; j--) {
					System.out.print(" ");
				}
				for(int j = 0; j<=i; j++) {
					System.out.print("*");
				}
				for(int j = 0; j<i; j++) {
					System.out.print("*");
				}
				System.out.println();
				
			}
			
			break;
		}
	}

}
