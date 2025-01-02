package atcoder.A_Four_Points;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		int x4 = 0;
		int y4 = 0;

		sc.close();
	
		// XOR 연산으로 같은값은 0 다르면 1 중복값 제거에 좋음
		x4 = x1 ^ x2 ^ x3;
		y4 = y1 ^ y2 ^ y3;
		
		System.out.println(x4 + " " + y4);
		
	}

}
