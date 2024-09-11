import java.util.Scanner;

public class Main {
	public static void main(String[] agrs) {
		
		Scanner sc = new Scanner(System.in);
		
		// 세 꼭짓점의 좌표 입력
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		
		sc.close();
		
		// 네 번째 꼭짓점 찾기
		int x4, y4;
		
		// x4를 찾기 위해, 세 개의 x 좌표 중 짝이 맞지 않는 하나를 찾는다.
		if (x1 == x2) {
			x4 = x3;
		} else if (x1 == x3) {
			x4 = x2;
		} else {
			x4 = x1;
		}
		
		// y4를 찾기 위해, 세 개의 y 좌표 중 짝이 맞지 않는 하나를 찾는다.
		if (y1 == y2) {
			y4 = y3;
		} else if (y1 == y3) {
			y4 = y2;
		} else {
			y4 = y1;
		}
		
		// 결과 출력
		System.out.println(x4 + " " + y4);
	}
}
