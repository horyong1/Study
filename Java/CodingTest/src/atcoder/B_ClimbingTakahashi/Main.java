package atcoder.B_ClimbingTakahashi;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] arrList = new int[N];
		
		for(int i = 0; i < N; i++) {
			arrList[i] = sc.nextInt();
		}
		sc.close();
		
		int result = 0;
		int cnt = 0;
		for(int i = 0; i < N-1; i++) {
			for(int j = i+1; j < N; j++) {
				if(arrList[i] >= arrList[j]) {
					result = arrList[i];
					break;
				}
				if(arrList[i] < arrList[j]) {
					result = arrList[j];
					cnt++;
					break;
				}
				
			}
			if(cnt == 0) {
				break;
			}
			cnt = 0;
		}
		
		System.out.println(result);
	}
}
