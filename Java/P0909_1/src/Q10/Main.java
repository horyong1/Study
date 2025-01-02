package Q10;

public class Main {
	public static void main(String[] args) {
		int sum1 = 10;
		int  sum2 = 0;
		
		for( int i = 0; i <= 10; i++) {
			for(int j = 0; j <= 10; j++) {
				sum2 = 2*i+4*j;
				if(sum2 == sum1 ) {
					System.out.println("x = "+i+", y = "+ j);
				}
			}
		}
		
	}
}
