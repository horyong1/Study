package atcoder.B_FailingGrade;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int P = sc.nextInt();
		int[] scores = new int[N];
		
		int cnt = 0;
		for(int i = 0; i < N; i++) {
			scores[i] = sc.nextInt();
			if(scores[i] < P){
				cnt++;
			}
		}
		sc.close();
		
		System.out.println(cnt);
	}

}
