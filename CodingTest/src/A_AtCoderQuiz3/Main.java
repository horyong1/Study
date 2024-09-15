package A_AtCoderQuiz3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); 
		sc.close();
		
		if( N >= 42) {
			N++;
		}
		
		System.out.printf("AGC%03d", N);
	}
}
