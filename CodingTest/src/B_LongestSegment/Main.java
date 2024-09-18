package B_LongestSegment;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] x = new int[N];
		int[] y = new int[N];
		
		for(int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			
		}
		sc.close();
		
		double maxDistance = 0;
		
		for(int i = 0; i < N; i++) {
			for(int j = i+1; j < N; j++) {
				double distance = Math.sqrt(Math.pow(x[j] - x[i], 2) + Math.pow(y[j] - y[i], 2));
				
				if (distance > maxDistance) {
					maxDistance = distance;
				}
				
			}
		}
		
		System.out.println(maxDistance);
		
		
	}

}
