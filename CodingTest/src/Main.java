import java.util.Scanner;

public class Main {
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		
		boolean upperCase = false;
		boolean lowerCase = false;
		boolean math = false;
		
		
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c >= 'a'  && c <= 'z') {
				lowerCase = true;
			}
			if(c >= 'A' && c <= 'Z') {
				upperCase = true;
			}
			
			int cnt = 0;
			for(int j = 0; j <str.length(); j++) {
				if(c == str.charAt(j)) {
					cnt++;
				}
				if(cnt > 1) {
					math = true;
					break;					
				}
			}
			if(math) {
				break;
			}
		}
		if(math) {
			System.out.println("No");
			
		}else if(upperCase && lowerCase) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
