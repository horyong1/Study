package B_Pizza;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();		
		int[] A = new int[N];
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		sc.close();
		
		
		int[] cutPoints = new int[N+1];				// 자른 각도를 저장할 배열
		cutPoints[0] = 0;							// 처음 자르는 지점은 0
		
		int angle = 0;
		for(int i = 0; i < N; i++) {
			angle = (angle + A[i]) % 360;			
			cutPoints[i+1] = angle;
		}
		
		// 오름차순으로 정렬
		for(int i = 0; i < cutPoints.length-1; i++) {
			for(int j = i+1; j < cutPoints.length; j++) {
				if(cutPoints[i] > cutPoints[j]) {
					int temp = cutPoints[i];
					cutPoints[i] = cutPoints[j];
					cutPoints[j] = temp;
				}
			}
		}
		
		int maxPiece = 0;
	
		for(int j = 0 ; j < N; j++) {
			int pieceSize = cutPoints[j+1] - cutPoints[j];
			
			if(pieceSize > maxPiece) {
				maxPiece = pieceSize;
			}
			
		}
		
		int lastPiece = 360 - (cutPoints[N] - cutPoints[0]);
		if(lastPiece > maxPiece) {
			maxPiece = lastPiece;
		}
			
		System.out.println(maxPiece);
		
	}
}
