package B_CountDistinctIntegers;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		int cnt = 0;
		
		for(int i = 0; i < N; i++) {
			boolean isUnique = true;
			
			for(int j = 0; j < i; j++) {
				if( arr[i] == arr[j]) {
					isUnique = false;
					break;
				}
			}
			if(isUnique) {
				cnt++;
			}
		}

		System.out.println(cnt);
	}

}
