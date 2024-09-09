package Q4;

public class Main {
	public static void main(String[] args) {
		int sum = 0;
		int cnt = 0;

		for (int i = 1;; i++) {
			if(sum >= 1000) {
				break;
			}
			if (i % 3 == 0) {
				if(i % 2 == 0) {
					sum += i;
					System.out.println(i + " " + sum);
				}
			}
			cnt = i;
		}
		System.out.println("=================");
		System.out.println(cnt);
		System.out.println(sum);

	}
}
