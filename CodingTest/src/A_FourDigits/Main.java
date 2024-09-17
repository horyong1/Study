package A_FourDigits;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.close();
		
		String str = String.valueOf(N) ;
		if(str.length() == 4) {
			System.out.println(str);
			
		}else {
			for(int i = 0; i < 4-str.length(); i++ ){
				System.out.print(0);
				
			}
			System.out.println(str);
			
		}
	}
}
