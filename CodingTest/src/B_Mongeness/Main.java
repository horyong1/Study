package B_Mongeness;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		
		int[][] square = new int[H][W];
		
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				square[i][j] = sc.nextInt();
			}
		}
		sc.close();
		
		boolean check = false;
		
		for(int i = 0; i < H-1; i++) {
			int cnt = 0;
			
			for(int j = 0; j < W-1; j++) {
				int A1 = square[i][j] + square[i+1][j+1];
				int A2 = square[i+1][j] + square[i][j+1];
				
				if(A1 <= A2) {
					check = true;
				}
				
				if(!(A1 <= A2)) {
					check = false;
					cnt++;
					break;
				}
			}
			if(cnt >= 1) {
				break;
			}
		}
		System.out.println(check ? "Yes" : "No");
		
	}

}
