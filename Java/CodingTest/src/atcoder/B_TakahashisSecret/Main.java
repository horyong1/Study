package atcoder.B_TakahashisSecret;

import java.util.Scanner;

/**
 * 다카하시가 친구 N명이 있는데
 * 친구한명 X 한테 비밀 이야기 함 
 * 여기서 친구들 중  친구 i가 비밀을 알게되면 아직 비밀을 모르는 친구Ai에게 말함 
 * 몇명이 알게될것인가? 
 * 
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int X = sc.nextInt() - 1;

		int[] arr = new int[N];
		boolean[] isCheck = new boolean[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt() - 1;
		}
		sc.close();

		isCheck[X] = true;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (isCheck[j]) {
					int share = arr[j];

					if (!isCheck[share]) {
						isCheck[share] = true;
					}
				}
			}
		}
		int count = 0;
		for(boolean c : isCheck) {
			if(c) {
				count++;
			}
		}
		System.out.println(count);
	}
}
