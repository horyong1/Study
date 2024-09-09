
public class Main {
	public static void main(String[] args) {
		int sum = 0;
		int n = 0;
		
		while(sum < 100) {
			n++;
			if(n % 2 == 0) {
				sum -= n;
				
			}else {
				sum += n;
			}
		}
		System.out.println(n);
		System.out.println(sum);
	}
}
