package Q12;

public class Main {
	public static void main(String[] args) {
		int cnt = 0;
		
		for(int i = 0; i <= 10000; i++) {
			String str = Integer.toString(i);
			
			for(char c : str.toCharArray()) {
				if( c == '8') {
					cnt++;
				}
			}
		}
//		for(int i = 0; i <= 10000; i++) {
//			if(i%10 == 8) cnt++;
//			if((i/10) % 10 == 8) cnt++;
//			if((i/100) % 10 == 8) cnt++;
//			if((i/1000) % 10 == 8) cnt++;
//			
//		}
		System.out.println(cnt);
		
		

	}
}
