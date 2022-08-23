package test576;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		String a = sc.next();
		int num2 = sc.nextInt();
		sc.close();
		
		if(a.equals("+")) {
			System.out.printf("%d + %d = %d",num1,num2,num1+num2);
		}else if(a.equals("-")) {
			System.out.printf("%d - %d = %d",num1,num2,num1-num2);
			
		}else if(a.equals("*")) {
			System.out.printf("%d * %d = %d",num1,num2,num1*num2);
			
		}else if(a.equals("/")) {
			System.out.printf("%d / %d = %d",num1,num2,num1/num2);
			
		}else {
			System.out.printf("%d %s %d = %d",num1,a,num2,0);
		}
				
		
	}

}
