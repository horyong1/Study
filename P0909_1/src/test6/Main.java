package test6;

public class Main {
	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		int cnt = 1;
		
		for(int i = 1; ; i++) {
			
			if(sum >= 100) {
				break;
			}
			
			if(i % 2 == 0 ) {
				sum = sum - i;
			}else {
				sum = sum + i;
			}
			cnt = i;
						
		}
		System.out.println(sum);
		System.out.println(cnt);
		
	}
}
