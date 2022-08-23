package test10871;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n2 = sc.nextInt();

		// 배열 없이 계산
		for(int i = 0; i<n; i++) {
			int n3 = sc.nextInt();
			
			if(n3<n2) {
				System.out.print(n3+" ");
			}
		}
		sc.close();
		
		//배열로 계산
//		int[] arr = new int[n];
//
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//	
//		}
//		sc.close();
//		
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i]<n2) {
//				System.out.print(arr[i]+" ");
//			}
//		}
	}
}
