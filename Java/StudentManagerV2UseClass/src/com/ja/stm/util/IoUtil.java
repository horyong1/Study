package com.ja.stm.util;

import java.util.Scanner;

/**
 * static 멤버로만 이루어져 있는 클래스
 * 글로벌 하게 활용하기 위한 유틸용 클래스
 * static 앞으로 많이 안쓸거라서 여기서 한법 쓰는 방법 연습
 * */
public class IoUtil {
	private static Scanner sc = new Scanner(System.in);
	
	private IoUtil() {
		
	}
	
	public static void print(String text) {
		System.out.println(text);
	}
	
	public static String input(String prompt) {
		System.out.print(prompt);
		String result = sc.nextLine();
		return result;
	}
	
	public static void pause() {
		System.out.println("계속하시려면 엔터를 입력해주세요...");
		sc.nextLine();
	}

	
}
