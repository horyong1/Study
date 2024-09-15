package B_GoStraightAndTurnRight;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		int x = 0;
		int y = 0;
		int N = sc.nextInt();
		String str = sc.next();
		sc.close();
		
		int cnt = 0;
		for(int i = 0; i < N; i++) {
			if(str.charAt(i) == 'S') {
				if(cnt == 0) {
					x++;
				}else if(cnt == 1) {
					y--;
					
				}else if(cnt == 2) {
					x--;
				}else if(cnt == 3) {
					y++;
				}
			}
			
			if(str.charAt(i) == 'R') {
				cnt++;
				if(cnt > 3) {
					cnt = 0;
				}
			}
		}
		System.out.println(x + " " + y);
			
	}
}
