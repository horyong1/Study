package Q13;

public class Main {
	public static void main(String[] args) {

		for(int i = 1; i < 100; i++) {
			int cnt = 0;
			
			if(i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
				cnt ++;
			}
			
			if(i / 10 == 3 || i / 10 == 6 || i / 10 == 9) {
				cnt ++;					
			}
			
			if(cnt == 2) {
				System.out.println(i + " 박수 두번");
			}
			if(cnt == 1) {
				System.out.println(i + " 박수 한번");
			}
		}		

	}
}
