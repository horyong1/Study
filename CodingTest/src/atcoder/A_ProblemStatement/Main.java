package atcoder.A_ProblemStatement;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); // 메달 받는 순위
		int B = sc.nextInt(); // 랜덤 메달 하한선
		int C = sc.nextInt();	// 랜덤 메달 받는 사람 수
		int X = sc.nextInt();	// Iroha-chan 등수 
		sc.close();
		
		if(X <= A) {
			System.out.printf("%.12f",1.000000000000);
			return;
		} 
		
		if(X > A) {
			if(X <= B) {
				int rank = A;
				int rank2 = B-rank;
				double result = (double)C/rank2; 
				System.out.println(result);
				
			}else {
				System.out.printf("%.12f",0.000000000000);
				
			}
		}
	}

}
