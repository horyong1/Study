import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		// 예시....
		Scanner sc = new Scanner(System.in);
		System.out.println("**************************");
		System.out.println("*      학생 관리 프로그램       *");
		System.out.println("**************************");
		
		while(true) {
			System.out.println("=========== 메뉴 ===========");
			System.out.println("1. 학생 정보 입력");
			System.out.println("2. 학생 정보 출력");
			System.out.println("q. 프로그램 종료");
			System.out.println("....");
			System.out.print("커맨드 입력 > ");
			String command = sc.nextLine();
			
			if(command.equals("q")) {
				System.out.println("[테스트] 프로그램 종료 로직 수행.");
				break;
			}
			
			if(command.equals("1")) {
				System.out.println("[테스트] 입력 로직 수행.");
			}else if(command.equals("2")) {
				System.out.println("[테스트] 출력 로직 수행.");
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
			System.out.println("계속 하시려면 enter를 입력해주세요.");
			sc.nextLine();
		}
		sc.close();
		System.out.println("프로그램을 이용해 주셔서 감사합니다.");
	}

}
