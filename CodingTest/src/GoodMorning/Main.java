package GoodMorning;

import java.util.Scanner;

//https://atcoder.jp/contests/abc245/tasks/abc245_a
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// 시간 입력
		int A = sc.nextInt(); // Takahashi 시간
		int B = sc.nextInt(); // Takahashi 분
		int C = sc.nextInt(); // Aoki 시간
		int D = sc.nextInt(); // Aoki 분
		sc.close();
		
		if (A < C) {
			System.out.println("Takahashi");
		} else if (A > C) {
			System.out.println("Aoki");
		} else {
			if (B < D) {
				System.out.println("Takahashi");
			} else if (B > D) {
				System.out.println("Aoki");
			} else {
				System.out.println("Takahashi");
			}
		}

	}

}
