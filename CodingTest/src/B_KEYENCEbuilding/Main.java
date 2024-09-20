package B_KEYENCEbuilding;

import java.util.Scanner;

public class Main {
	static int sum(int a, int b) {
		int sum = (4 * a * b) + (3 * a) +(3 * b);
		return sum;
	}
	
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
			boolean isCheck = false;
			
			for(int j = 1; j <= 1000; j++) {
				for(int k = 1; k <= 1000 ; k++) {
					int area = sum(j,k);
					if(area == arr[i]) {
						isCheck = true;
						break;
					}
					
					if(area > arr[i]) {
						break;
					}
				}
				if(isCheck) {
					break;
				}
			}
			if(!isCheck) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}


		
