package atcoder.A_LastCard;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int A  = sc.nextInt();
		sc.close();
		
		int cnt = 0;
		for(int i = 0; i < K; i++) {
			if(cnt == 0) {
				cnt = A;
				continue;
			}
			
			if( cnt == N) {
				cnt = 1;
				continue;
			}
			
			cnt++;
			
		}
		
		System.out.println(cnt);
		
	}

}
