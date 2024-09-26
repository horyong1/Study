package atcoder.A_10yenStamp;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int Y = sc.nextInt();
		sc.close();
		
		int minus = (Y-X);
		
		if(X >= Y) {
			System.out.println("0");
			return;
		}
		int yen = minus / 10;
		int yen1 = minus % 10;
		
		if(yen1 > 0) {
			yen += 1;
		}
		
		System.out.println(yen);
	}

}
