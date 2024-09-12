package Shampoo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int V = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.close();
		
		int cnt = 0;
		while(true) {
			int[] arr = {A,B,C};
			if(V <= 0) {
				break;
			}
			
			for(int i = 0; true; i++) {
				if(i == 3) {
					i = 0;
				}
				V  -= arr[i];
				
				if(V == 0 && cnt ==2) {
					cnt = 0;
					break;
				}else if(V < 0) {
					cnt = i;
					break;
				}
			}
			
			if(cnt == 0) {
				System.out.println("F");
			}else if(cnt == 1) {
				System.out.println("M");
			}else {
				System.out.println("T");
				
			}
		}
		
	}

}
