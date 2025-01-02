package atcoder.B_Whoismissing;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] cntList = new int[N+1];
		int inputCnt = N * 4 - 1;
		
		for(int i = 0; i < inputCnt; i++) {
			int num = sc.nextInt();
			cntList[num]++;
		}
		sc.close();
		
		int result = 0;
		for(int i = 1; i <= N; i++) {
			if(cntList[i] < 4 ) {
				result = i;
				break;
			}
		}
		
		
		System.out.println(result);
	}
}
