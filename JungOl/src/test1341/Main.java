package test1341;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		while(true) {
			if((n1<2||n1>9)||(n2<2||n2>9)) {
				n1 = sc.nextInt();
				n2 = sc.nextInt();
			}else {
				sc.close();
				break;
			}
		}
		
		if(n1>n2) {
			for(int i = n1; i>=n2; i-- ) {
				for(int j = 1; j<=9; j++) {
					System.out.printf("%d * %d = %2d   ",i,j,i*j);
					
					if(j%3==0) {
						System.out.println();
					}
				}
				System.out.println();
			}
		
		}else  {
			for(int i = n1; i<=n2; i++ ) {
				for(int j = 1; j<=9; j++) {
					System.out.printf("%d * %d = %2d   ",i,j,i*j);
					
					if(j%3==0) {
						System.out.println();
					}
				}
				System.out.println();
			}
		}
	}

}
