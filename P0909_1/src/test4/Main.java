package test4;

public class Main {
	public static void main(String[] args) {
		
		for(int i = 2; i <= 9; i++) {
			if( !(i == 6 ||  i == 7)) {
				for(int j = 1; j <= 9; j++) {
					System.out.printf("%d * %d = %d\n", i, j, i*j);
				}
				
				System.out.println("======================");
			}
		}
	}
}
