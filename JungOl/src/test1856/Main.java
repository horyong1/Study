package test1856;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = 1;
		int tmp = 0;
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		
		//일반 계산식으로 구하기
		for (int i = 0; i < num1; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < num2; j++) {
					System.out.print(n + " ");
					n++;
				}
				System.out.println();
				
			} else if (i % 2 != 0) {
				tmp=n+num2-1;
				
				for (int j = num2; j > 0; j--) {
					System.out.print(tmp + " ");
					tmp--;
					n++;

				}
				System.out.println();

			}
		}
		//이중 배열로 구하기
//		int [][]arr = new int[num1][num2] ;
//		
//		for(int i = 0; i<num1; i++) {
//			for(int j=0; j<num2; j++) {
//				arr[i][j]= n;
//				n++;
//				
//			}
//		}
//		
//
//		for (int i = 0; i < num1; i++) {
//			if(i%2==0) {
//				for(int j = 0; j<num2; j++) {
//					System.out.print(arr[i][j]+" ");
//				}
//				System.out.println();
//				
//			}else if(i%2!=0) {
//				for(int j= num2-1; j>=0; j--) {
//					System.out.print(arr[i][j]+" ");
//					
//				}
//				System.out.println();
//			}
//		}

	}

}
