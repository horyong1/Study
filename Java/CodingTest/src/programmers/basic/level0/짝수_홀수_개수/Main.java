package programmers.basic.level0.짝수_홀수_개수;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution {
//	private int[] answer = new int[2];
//	private int even = 0;
//	private int odd = 0;
//	public int[] solution(int[] num_list) {
//
//        int length = num_list.length;
//       
//        for(int i = 0; i < length; i++) {
//        	int value = num_list[i];
//        	even(value);
//        	odd(value);
//        }
//        
//        answer[0] = even;
//        answer[1] = odd;
//        return answer;
//    }
//    
//    private int even(int value) {
//    	return value % 2 == 0 ? ++even : 0;
//    }
//    
//    private int odd(int value) {
//    	return value % 2 != 0 ? ++odd : 0;
//    }
	public int[] solution(int[] num_list) {
		int[] answer = new int[2];
		for(int i = 0; i < num_list.length; i++) {
			answer[num_list[i] % 2]++;
		}
		return answer;
	}
}