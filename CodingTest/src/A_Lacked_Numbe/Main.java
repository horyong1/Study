package A_Lacked_Numbe;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		
		int[] arr = new int[str.length()];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i)-'0';
		}
		
		for(int i = 0; i <= arr.length; i++) {
			int cnt = 0;
			for(int k = 0; k < arr.length; k++) {			
				if(arr[k] == i) {
					break;
				}else {
					cnt ++;
				}
				
			}
			if(cnt > 8) {
				System.out.println(i);
			}
			
		}
		
		
	}

}
