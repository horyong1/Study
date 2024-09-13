package A_Move_Right;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		sc.close();
		
		int[] arr = new int[str.length()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i) - '0';
		}
		
		int N = arr.length;	
		 
		for (int k = N-1; k >= 1; k--) { 
			arr[k] = arr[k-1];				// 끝에서 부터 데이터 넣기
		}

		arr[0] = 0;							// 0번지는 데이터 이동하면 무조건 0

		for (int a : arr) {
			System.out.print(a);
		}
		System.out.println();
		System.out.println(863%1);
		System.out.println(863/863);
	}
}
