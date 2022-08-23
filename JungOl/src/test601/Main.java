package test601;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		
		for(int i = 1 ; i<s.length()+1; i++) {
			System.out.print(s.substring(s.length()-i,s.length()));
			System.out.println(s.substring(0, s.length()-i));
			
		}
		
	}

}
