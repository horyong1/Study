import java.util.Scanner;

public class P2 {
	public static void main(String[] args) {
		// 콘솔 입출력 관련 API 소개
		Scanner sc = new Scanner(System.in);
		System.out.println("야호");
		System.out.println("야호");
		System.out.println("야호");
		System.out.print("얍\n");
		System.out.print("점수를 입력하세요 > ");

		String inputValues = sc.nextLine();
		int score = Integer.parseInt(inputValues);
		
		if (score >= 90) {
			System.out.println("A학점 입니다.");
		} else if (score >= 80) {
			System.out.println("B학점 입니다.");

		} else {
			System.out.println("F학점 입니다.");
		}

		System.out.println("입력 받은 값 : " + inputValues);
	}
}
