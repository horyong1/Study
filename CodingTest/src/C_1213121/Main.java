package C_1213121;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.close();
		
		String result = generateSequence(N);
		System.out.println(result);

	}
	private static String generateSequence(int n) {
		if( n == 1) {
			return "1";
		}
		
		String previous = generateSequence(n - 1);
		
		return previous + " " + n + " " + previous;
	}

}
