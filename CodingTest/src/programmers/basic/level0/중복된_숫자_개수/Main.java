package programmers.basic.level0.중복된_숫자_개수;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		
	}
}
class Solution {
    public int solution(int[] array, int n) {
//        int answer = 0;
//        for(int a : array) {
//        	if(a == n) {
//        		answer++;
//        	}
//        }
        return (int)Arrays.stream(array).filter(i -> i==n).count();
    }
}