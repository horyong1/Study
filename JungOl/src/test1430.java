import java.util.Scanner;

public class test1430 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.close();
		
		long sum = 0;
		int cnt = 0;
		sum = A * B * C;
		String a = String.valueOf(sum);
		
		System.out.println(sum);
		System.out.println(a);
		
		for(char i = '0'; i<10; i++) {
			cnt=0;
			for(int j = 0; j<a.length(); j++) {
				if(i==a.charAt(j))
					cnt++;
			}
			System.out.println(cnt++);
		}
	}

}
