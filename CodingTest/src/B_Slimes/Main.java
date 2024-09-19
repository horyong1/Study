package B_Slimes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long A = sc.nextLong();
		long B = sc.nextLong();
		long K = sc.nextLong();
		sc.close();
		
		long sum = 0L;
		int cnt = 0;
		
		if(A==B) {
			System.out.println(cnt);
			return;
		}
		sum = A * K;
		cnt++;
		while(true) {
			
			if(sum >= B) {
				System.out.println(cnt);
				break;
			}
			if(A<B) {
				sum *= K;
				cnt++;
			}
			
			
		}
		
	}

}
