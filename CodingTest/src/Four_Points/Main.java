package Four_Points;

import java.util.Scanner;

public class Main {
	
	public static int distance(int x, int y) {
		int distance = 0;
		
		if( x < 0 ) {
			distance = (x * -1) + y;
		}else if( x < 0 ) {
			distance = x + (y * -1);
		}else {
			distance = x + y;
		}
		
		if(distance < 0) {
			distance = distance * -1;
		}
		return distance;
	}

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
		int width = 0;
		int height = 0;
		
		width = distance(x1, x3);
		height = distance(y1, y2);
		
		if(x1 <0) {
			x4 = width + x1;
		}else {
			x4 = width - x1;
		}
		
		if(y3 <0) {
			y4 = height + y3;
		}else {
			y4 = height - y3;
		}
		
		if(x4 < 0) {
			
		}else if(x3 < 0) {
			x4 = x4 * -1;
		}
		
		if(y1 < 0 ) {
			y4 = y4 * - 1;
		}
		
		System.out.println(width);
		System.out.println(height);
		
		System.out.println(x4 + " " + y4);
//		if( x1 < 0 ) {
//			width = (x1 * -1) + x3;
//		}else if( y3 < 0 ) {
//			width = x1 + (x3 * -1);
//		}else {
//			width = x1 + x3;
//		}
//		
//		if( y1 < 0 ) {
//			width = (y1 * -1) + y2;
//		}else if( y2 < 0 ) {
//			width = y1 + (y2 * -1);
//		}else {
//			width = y1 + y2;
//		}
		
		
		
	}

}
