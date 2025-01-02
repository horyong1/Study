package Q11;

public class Main {
	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;

		  while(num > 0) {
			  sum += num % 10;
			  num /= 10;
		  }

//		for (; num > 0; num /= 10) {
//			sum += num % 10;
//		}

		System.out.println(sum);

	}
}
