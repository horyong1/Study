package com.student.Ioutil;

import java.util.Scanner;

public class IoUtil {
	private static Scanner sc = new Scanner(System.in);
	
	public static void print(String message) {
		System.out.println(message);
	}
	
	public static String input(String message) {
		System.out.print(message);
		String result = sc.nextLine();
		return result;
	}
	
	public static void pause() {
		System.out.println("계속하시려면 엔터를 입력해주세요....");
		sc.nextLine();
	}
}
