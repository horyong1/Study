package test141;

import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		for(int i = 1; ;i++) {
			if((N*i)%10==0) {
				System.out.print(N*i+" ");
				break;
				
			}else if(N*i>100)
				break;
			
			System.out.print(N*i+" ");
		}
	}
}
