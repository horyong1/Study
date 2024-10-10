package programmers.level0.n의_배수_고르기;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}

class Solution {
    public int[] solution(int n, int[] numlist) {
//        int[] answer = new int[numlist.length];
//        int index = 0;
//        for(int i = 0; i < numlist.length; i++) {
//        	if(numlist[i] % n == 0) {
//        		answer[index++] = numlist[i]; 
//        	}
//        }
//        
//        return Arrays.stream(answer).filter(num -> num != 0).toArray();
    	return Arrays.stream(numlist).filter(value -> value % n == 0).toArray();
    }
}