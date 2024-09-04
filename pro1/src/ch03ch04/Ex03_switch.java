package ch03ch04;

import java.util.Scanner;

/**
 * switch문 switch(){ case 값1 : 실행코드; break; case 값2 : 실행코드; break; case 값3 :
 * 실행코드; break; default : 실행코드;( default문 생략 가능함) break; }
 */
public class Ex03_switch {

	public static void main(String[] args) {
		// 주사위 굴려서 나온 수를 출력하시오.
		Scanner sc = new Scanner(System.in);
		String str = "";
		char c = 0;

		System.out.println("1~6사이 주사위 숫자를 입력하세요");
		str = sc.next();
		if (str.length() > 1) {
			System.out.println("잘못된 숫자");
		} else {
			c = str.toString().charAt(0);

			switch (c) {
			case '6':
				print(str);
				break;
			case '5':
				print(str);
				break;
			case '4':
				print(str);
				break;
			case '3':
				print(str);
				break;
			case '2':
				print(str);
				break;
			case '1':
				print(str);
				break;
			default:
				System.out.println("잘못된 숫자");
				break;
			}
			sc.close();
		}

	}

	public static void print(String n) {
		String str = n + " 칸 앞으로 전진";
		System.out.println(str);
	}

}
