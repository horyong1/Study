package B_MatrixTransposition;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		
		int[][] arr = new int[H][W];
		
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		sc.close();
		
		for(int i = 0; i < W; i++) {
			for(int j = 0; j < H; j++) {
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
		
		
	}

}
