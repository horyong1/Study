package atcoder.B_CountingArrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
//	static boolean equal(int[] seq1, int[] seq2) {
//        if (seq1.length != seq2.length) {
//            return false;  
//        }
//        for (int i = 0; i < seq1.length; i++) {
//            if (seq1[i] != seq2[i]) {
//                return false; 
//            }
//        }
//        return true;  
//    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[][] arr = new int[N][];
		
		for(int i = 0; i < N; i++) {
			int num = sc.nextInt();
			arr[i] = new int[num];
			for(int j = 0; j < num; j++) {
				arr[i][j] = sc.nextInt();				
			}
		}
		sc.close();
		
		HashSet<List<Integer>> hashSet = new HashSet<>();
		
		for(int[] array : arr) {
			List<Integer> list = new ArrayList<>();
			for(int ar : array) {
				list.add(ar);
			}
			hashSet.add(list);
		}
		
		System.out.println(hashSet.size());
		
		
// 답은 맞으나 시간초과로 사용 불가		
//		boolean check[] = new boolean[N];
//		int cnt = 0;
//		
//		for(int i = 0; i < N; i++) {
//			if(!check[i]) {
//				cnt++;
//				for(int j = i+1; j < N; j++) {
//					if(!check[j] && equal(arr[i], arr[j])) {
//						check[j] = true;
//					}
//				}
//			}
//			
//		}
//		
//		System.out.println(cnt);
		
	}
}
