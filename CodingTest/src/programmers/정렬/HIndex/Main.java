package programmers.정렬.HIndex;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		
		int[] arr = {3, 0, 6, 1, 5};
		System.out.println(new Solution().solution(arr));
	}
}	
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int h_index= citations.length;
        Arrays.sort(citations);
        
        for(int i = h_index-1; i >= 0; i-- ) {
        	if(citations[i] >= answer+1) {
        		answer++;        		
        	}else {
        		break;
        	}
        }
       
        return answer;
    }
}