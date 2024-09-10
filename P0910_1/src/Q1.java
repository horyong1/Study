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
		int G = sc.nextInt();
		
		int result1 = 0;
		int result2 = 0;
		int sce1 = 0;
		int sce2 = 0;
		

		// Takahashi
		if(A > G) {
			result1 = (A - G)* B;
		}else if( A + C >= G ) {
			result1 = A * B;
		}else {
			sce1 = G /(A+C);
			result1 = (sce1+A)* B;
			int s = G % (A + C);
			result1 = result1 + (A-s)*B; 
		}
		
		
		// Aoki
		if(D > G) {
			result2 = (D - G)* E;
		}else if( D + F >= G) {
			result2 = D * E; 
		}else {			
			sce2 = G/(D+F);
			result2 = (D * E)* sce2;
			int s = G % (D + F);
			result2 = result2 + (D-s)*E; 
		}
		
		
		
		if(result1 > result2) {
			System.out.println("Takahashi");
		}else if(result1 < result2) {
			System.out.println("Aoki");
		}else {
			System.out.println("draw");
		}
		
		
	}
}
