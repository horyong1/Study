package test6;

public class Main {
	public static void main(String[] args) {
		int sum = 0;
		int cnt = 1;
		
		for(int i = 1; true ; i++) {
			
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
		
//		int sign = 1;
//		for(int i = 1; true; i++) {
//			sum += (i*sign);
//			sign = sign *i;
//		}
		
		System.out.println(sum);
		System.out.println(cnt);
		
	}
}
