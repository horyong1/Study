package atcoder.A_QQsolver;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		
		char[] arr = str.toCharArray();
		
		int a = arr[0]-'0';
		int b = arr[2]-'0';
		
		System.out.println(a*b);
	}
}
