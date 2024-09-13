package A_DigitMachine;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int temp = 0;
		
		for(int i = 0; i < 3; i++) {
			if(i == 0) {
				temp = arr[i];
			}else {
				temp = arr[temp];
			}
		}
		System.out.println(temp);
	}
}
