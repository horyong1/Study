package test186;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1= sc.next();
		String str2= sc.next();
		sc.close();
		
		int len1=str1.length();
		int len2=str2.length();
		
		if(len1>len2) {
			System.out.println(len1);
		}else if(len1<len2) {
			System.out.println(len2);
			
		}else {
			System.out.println(len1);
		}
	}

}
