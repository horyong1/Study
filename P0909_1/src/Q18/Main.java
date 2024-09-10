package Q18;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int[] arr = new int[str.length()];
		int sum = 0;
		for(int i = 0; i< str.length(); i++) {
			arr[i] = str.charAt(i)-'0';
			
		}
		
		sum = str.charAt(0)-'0';
		
		for(int i = 1 ; i < arr.length; i++) {
			int num = arr[i];
			
			if(num <= 1 || sum <= 1) {
				sum += arr[i];
			}else {
				sum *= arr[i];
			}
		}
		
//		for(int i = 0; i < arr.length; i++) {
//			if(min > arr[i]) {
//				min  = arr[i];
//				key = i;
//			}
//		}
//		if(key == 0 ) {
//			sum = arr[0]+arr[1];
//			for(int i = 2; i < arr.length; i++) {
//					sum =sum * arr[i];
//				
//			}
//		}
//		else{
//			sum = arr[0];
//			for(int i = 1; i < arr.length; i++) {
//				if(arr[i] == min) {
//					sum += arr[i];
//				}else {
//					sum *= arr[i];
//				}
//			}
//		}
		System.out.println("합계  ::::   " + sum);
 
	}
}
