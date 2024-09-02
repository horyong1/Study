package ch01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[100];
		int cnt = 0;
		while(true) {
			arr[cnt] = sc.nextInt();
			if(arr[cnt] < 1 || arr[cnt]>10) {
				break;
			}
			cnt++;
		}
		for(int i = 0; i < cnt; i++) {
			System.out.print(arr[i] +" ");
		}
		
		
	}

}
