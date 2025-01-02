package ch03ch04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex02_if {
	public static void main(String[] args) {
		// 주사위 굴려서 나온 수를 출력하시오.
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		try {
			while (true) {
				System.out.println("1~6사이 주사위 숫자를 입력하세요");
				num = sc.nextInt();

				if (num > 6 || num < 1) {
					System.out.println("잘못된 숫자");
					break;
				} else {
					System.out.println(num + "칸 앞으로 전진");
				}
			}
		} catch (InputMismatchException e) {
			System.out.println(e);
			System.out.println("잘못된 숫자");
			
		}

	}

}
