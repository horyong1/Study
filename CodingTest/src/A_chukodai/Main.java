package A_chukodai;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		char[] arr = str.toCharArray();
		char temp = arr[a-1];
		arr[a-1] = arr[b-1];
		arr[b-1] = temp;
		
		for(char ar : arr) {
			System.out.print(ar);
		}
	}
}
