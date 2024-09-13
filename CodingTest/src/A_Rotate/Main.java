package A_Rotate;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		
		int sum = 0;
		int cnt = 0;
		for(int i = 0; i < str.length(); i++ ) {
			cnt = i ;
			String tempstr = "";
			String temp ="";
			for(int j = 0; j < str.length(); j++) {
				if(cnt > 2) {
					cnt = 0;
				}
				temp+=String.valueOf(str.charAt(cnt)) ;
				
				cnt++;
			}
			tempstr = temp;
			sum += Integer.parseInt(tempstr);
		}
		System.out.println(sum);
	}

}
