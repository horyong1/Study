package B_Election;

import java.util.Scanner;
/**
 * N 명의 사람이 투표 
 * S 라는 이름의 후보들 
 * 이중 가장 많은 표를 받은 사람 
 * for문으로 N명 만큼 값을 입력 받음
 * 배열? 
 * 입력받은 값들을 비교해서 중복 된 값이 많은 이름을 체크 
 * 
 * */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String[] strList = new String[N];
		int[] voteList = new int[N];
		
		for(int i = 0; i < N; i++) {
			strList[i] = sc.next();
			
		}
		sc.close();
		
		
		for(int i = 0; i < N; i++) {
			int cnt = 1;
			for(int j = i+1; j < N; j++) {
				if(strList[i].equals(strList[j])) {
					cnt++;
					voteList[j] = -1;
				}
			}
			voteList[i] = cnt;
		}
		
		int max = 0;
		String winner = "";
		for(int i = 0; i < N; i++) {
			if(voteList[i] > max) {
				max = voteList[i];
				winner = strList[i];
			}
		}
		
		System.out.println(winner);
	}
}
