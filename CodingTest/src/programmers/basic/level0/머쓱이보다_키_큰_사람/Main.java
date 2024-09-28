package programmers.basic.level0.머쓱이보다_키_큰_사람;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int a : array) {
        	if(a > height) {
        		answer++;
        	}
        }
        return answer;
//        return (int)Arrays.stream(array).filter(h -> h > height).count();
    }
}