package Q17;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0;
		
		
		for(int i = 0; i <= N; i++) {
			for(int j = 0; j <= 59; j++) {
				for(int k = 0; k <= 59; k++) {
					if(i / 10 == 3 || i % 10 == 3 || 
					   j / 10 == 3 || j % 10 == 3 || 
					   k / 10 == 3 || k % 10 == 3 ) {
						System.out.printf("%02d 시 %02d분 %02d초\n",i,j,k);
						cnt++;
					}
					
				}
			}
		}
		System.out.println(cnt);

	}
}
