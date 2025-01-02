package Q08;

public class Main {
	public static void main(String[] args) {

		int n1 = 863;
		boolean b = true;
		
		for (int i = 2; i < n1; i++) {
			if(n1 % i == 0) {
				b = false;
				break;
			}
		}
		
		if(b) {
			System.out.println("소수 입니다.");			
		}else {
			System.out.println("소수가 아닙니다.");			
			
		}

	}
}
