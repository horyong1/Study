package ch03ch04;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * switch문 switch(){ case 값1 : 실행코드; break; case 값2 : 실행코드; break; case 값3 :
 * 실행코드; break; default : 실행코드;( default문 생략 가능함) break; }
 */
public class Ex3_switch {
	public static void main(String[] args) {
		// 주사위 굴려서 나온 수를 출력하시오.
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int n = 0;
		try {

			System.out.println("1~6사이 주사위 숫자를 입력하세요");
			num = sc.nextInt();
			switch (num) {
			case 6:
				n = num;
				break;
			case 5:
				n = num;
				break;
			case 4:
				n = num;
				break;
			case 3:
				n = num;
				break;
			case '2':
				n = num;
				break;
			case '1':
				n = num;
				break;
			default:
				System.out.println("잘못된 숫자 ");
				break;

			}
			System.out.println(n + "칸 앞으로 전진");

		} catch (InputMismatchException e) {
			System.out.println(e);
			System.out.println("잘못된 문자");

		}

	}

}
