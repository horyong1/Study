package test;

import java.util.Scanner;

public class IoUtil {
	private final static Scanner sc = new Scanner(System.in);
	
	public static void print(String message) {
		System.out.println(message);
	}
	
	public static String input(String message) {
		System.out.print(message + " >>> ");
		return sc.nextLine();
	}
	
	public static void pause(){
		System.out.println("계속 하시려면 enter를 입력하세요.");
		sc.nextLine();
	}
}
