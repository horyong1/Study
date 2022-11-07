package test2480;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int N1 = sc.nextInt();
		int N2 = sc.nextInt();
		int N3 = sc.nextInt();
		sc.close();
		int sum = 0;
		int max = 0;

		if (N1 == N2 && N1 == N3) {
			sum = 10000 + (N1) * 1000;
			System.out.println(sum);
		} else if (N1 == N2 || N1 == N3) {
			sum = 1000 + (N1) * 100;
			System.out.println(sum);
		} else if (N2 == N3) {
			sum = 1000 + (N2) * 100;
			System.out.println(sum);
		}else {
			if(N1>max) max = N1;
			if(N2>max) max = N2;
			if(N3>max) max = N3;
			
			sum = max*100;
		System.out.println(sum);	
		}
	}

}
