package atcoder.A_Jogging;

import java.util.Scanner;

public class Q1_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 > ");
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int E = sc.nextInt();
		int F = sc.nextInt();
		int G = sc.nextInt();
		
		int result1 = 0;
		int result2 = 0;
		int cycleT = 0;
		int cycleA = 0;
		

		// Takahashi
		// 총 시간보다 걷는 시간이 클때
		if(A >= G) {
			result1 = G* B;
			//걷는 시간과 휴식시간 합이 총 시간보다 클때
		}else if( A + C >= G ) {
			result1 = A * B;			// 걷는 시간 * 속도 계산하여 거리값 계산 	
			
		}else {
			cycleT = G /( A + C );	// 총시간과 걷는시간 + 휴식시간 나누기해서 몇번 주기 계산하기
			result1 = cycleT * A * B;	// 해당 주기만큼 걷는 시간과 속도 곱해서 계산하기
			int S = G % ( A + C );	// 주기 계산하고 남은 시간 계산하기
			if(S >= A) {
				// 남은 시간이 A 이상이면 A초 동안만 걷기
				result1 += A * B; 
			}else {
				// 남은 시간이 A 보다적으면 S초 동안만 걷기
				result1 += S * B;
			}
		}
		
		
		// Aoki
		if(D >= G) {
			result2 =  G * E;
		}else if( D + F >= G) {
			result2 = D * E;
			
		}else {			
			cycleA = G /( D + F );
			result2 = cycleA * D * E ;
			int S = G % (D + F);
			
			if(S >= D ) {
				// 남은 시간이 D 이상이면 D초 동안만 걷기
				result2 += D * E; 
			}else {
				// 남은 시간이 D 보다적으면 S초 동안만 걷기
				result2 += S * E; 
				
			}
		}
			
		
		
		if(result1 > result2) {
			System.out.println("Takahashi");
		}else if(result1 < result2) {
			System.out.println("Aoki");
		}else {
			System.out.println("Draw");
		}
		
		
	}
}
