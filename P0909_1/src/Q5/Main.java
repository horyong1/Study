package Q5;

public class Main {
	public static void main(String[] args) {
		int sum1 = 0;
		int sum2 = 0;
		for(int i = 1; i <= 10; i ++) {
			sum1 += i;
			sum2 += sum1;
			
			System.out.println(sum1);
			System.out.println("========");
			System.out.println(sum2);
		}
		System.out.println(sum2);

	}
}
