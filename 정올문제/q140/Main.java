package test140;

import java.util.Scanner;

public class Main {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0, sum = 0;
		int avg = 0;
		while(cnt<20) {
			int N = sc.nextInt();
			cnt++;
			
			if(N==0) {
				cnt--;
				sc.close();
				break;
			}
			sum+=N;
		}
		avg= sum / cnt;
		System.out.println(sum+" "+ avg);
	}
}
