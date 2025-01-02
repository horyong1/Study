package Q06;

public class Main {
	public static void main(String[] args) {
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				if(i % 2 == 0) {
					if(i >= j) {
						System.out.printf("%d * %d = %d\n",i,j,i*j);
					}
				}
			}
			
			if(i%2 == 0) {
				System.out.println("==========");
				
			}
		}

	}
}
