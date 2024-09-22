package B_StringShifting;

import java.util.Scanner;

public class Main {
//	static int check(char[] a, String b) {
//		int difference = 0;
//		for(int i = 0; i < a.length; i++	) {
//			difference  = a[i] - b.charAt(i);
//			if(difference != 0) {
//				return difference;
//			}
//		}
//		return 0;
//	}
	static int check(char[] a, char[] b) {
		for(int i = 0; i < a.length; i++	) {
			if(a[i] - b[i] != 0) {
				return a[i] - b[i];
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String S = sc.next();
		sc.close();
		
		char[] arr = S.toCharArray();
		char[] Smin = S.toCharArray();
		char[] Smax = S.toCharArray();
//		String Smin = S;
//		String Smax = S;

				
		for (int i = 0; i < arr.length; i++) {
			// 왼쪽 시프트
			char temp = arr[0];
			for (int j = 0; j < arr.length - 1; j++) {
				arr[j] = arr[j + 1];

			}

			arr[arr.length - 1] = temp;

//			String shifted = new String(arr);

			if (check(arr, Smin) < 0) {
				Smin = arr.clone();
			}

			if (check(arr, Smax) > 0) {
				Smax = arr.clone();
			}
		}
		
		System.out.println(new String(Smin));
		System.out.println(new String(Smax));
	}
}
