package B_AReverse;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int L = sc.nextInt()-1;
		int R = sc.nextInt()-1;
		String str = sc.next();
		sc.close();
		
		int cnt = R;
		char[] cList = str.toCharArray();
		for(int i = 0; i < str.length(); i++) {
			if(L <= i && i <= R) {
				System.out.print(cList[cnt--]);
			}else {
				System.out.print(cList[i]);
			}
			
		}
		
	}
}
