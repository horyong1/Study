import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 > ");
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int E = sc.nextInt();
		int F = sc.nextInt();
		int X = sc.nextInt();
		sc.close();
		
		int cycleT = A + C;						// 걷는시간+휴식시간 
		int fcycleT = X / cycleT;				// 전체 주기 반복 횟수 
		int remainingTimeT = X % cycleT;		// 전체 주기 후 남는 시간
		int distanceT = fcycleT * A * B ;		// 주기 반복 횟수와 걷는 거리 계산
		// Takahashi
		if(remainingTimeT <= A) {			
			distanceT += remainingTimeT * B;	// 남는 시간이 A보다 적으면 남는 시간 * 속도
		}else {
			distanceT += A * B;					// 남는 시간이 A보다 크면 걷는 시간 * 속도
		}
		
		int cycleA = D + F;
		int fcycleA = X / cycleA;
		int remainingTimeA = X % cycleA;
		int distanceA = fcycleA * D * E;
		// Aoki
		if(remainingTimeA <= D) {
			distanceA += remainingTimeA * E;
		}else {
			distanceA += D * E;	
		}
		
		
		if(distanceT > distanceA) {
			System.out.println("Takahashi");
		}else if(distanceT < distanceA) {
			System.out.println("Aoki");
		}else {
			System.out.println("Draw");
		}
		
		
	}
}
