package C_JustK;

import java.util.Scanner;


public class Main {
	private static int N, K;
	private static String[] strings;
	private static int maxDistinctChars = 0;
	
	static void chooseStrings(int index, int[] charCount) {
		if(index == N) {
			int validCharCount = 0;
			for(int count : charCount) {
				if(count == K) {
					validCharCount++;
				}
			}
			maxDistinctChars = Math.max(maxDistinctChars, validCharCount);
			return;
		}
		
		chooseStrings(index + 1, charCount);
		
		int[] newCharCount = charCount.clone();
		for(char c : strings[index].toCharArray()) {
			newCharCount[c- 'a']++;
		}
		chooseStrings(index +1, newCharCount);
	}
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();
        K = sc.nextInt();
        
        strings = new String[N];
        
        for(int i = 0; i < N; i++) {
        	strings[i] = sc.next();
        }
        sc.close();
        
        chooseStrings(0, new int[26]);
        
        System.out.println(maxDistinctChars);
//        int N = sc.nextInt();
//        int K = sc.nextInt();
//
//        String[] strings = new String[N];
//        for (int i = 0; i < N; i++) {
//            strings[i] = sc.next();
//        }
//        sc.close();
//
//        int maxDistinctChars = 0;
//
//        // 모든 부분집합을 비트마스크로 탐색
//        for (int mask = 1; mask < (1 << N); mask++) {
//            int[] charCount = new int[26]; // 각 문자의 출현 횟수를 카운트
//
//            // 선택된 문자열들에서 문자 카운트
//            for (int i = 0; i < N; i++) {
//                if ((mask & (1 << i)) != 0) { // i번째 문자열이 선택되었는지 확인
//                    for (char c : strings[i].toCharArray()) {
//                        charCount[c - 'a']++;
//                    }
//                }
//            }
//
//            // 정확히 K번 등장하는 문자 수 계산
//            int validCharCount = 0;
//            for (int count : charCount) {
//                if (count == K) {
//                    validCharCount++;
//                }
//            }
//
//            // 최대 개수 업데이트
//            maxDistinctChars = Math.max(maxDistinctChars, validCharCount);
//        }
//
//        System.out.println(maxDistinctChars);
	}
}
