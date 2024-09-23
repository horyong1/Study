package ch03ch04;

/**
 * do while()
 * 
 * do{ 무조건 한번은 실행 되고 그다음 조건을 확인해서 반복함 }while(조건);
 * 
 */
public class Ex10_dowhile {
	public static void main(String[] args) {
		int i = 100;
		while (i >
		10) {
			System.out.println("조건을 만족하는구나!" + i);
			i--;
		}

		do {
			System.out.println("do while문 무조건 한번 실행 " + i);

		} while (i < 10);
	}
}
