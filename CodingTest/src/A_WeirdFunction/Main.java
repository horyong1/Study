package A_WeirdFunction;

import java.util.Scanner;

public class Main {
	
	public static int f(int t) {
		int fx = (t*t) + (2*t) + 3;
		return fx;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.close();
		
		int sum = 0;
		sum = f(f(f(t)+t) + f(f(t)));
		System.out.println(sum);
	}
}
