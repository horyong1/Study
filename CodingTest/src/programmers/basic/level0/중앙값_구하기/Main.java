package programmers.basic.level0.중앙값_구하기;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

	}

}

class Solution{
	public int solution(int[] array) {
		int answer = 0;
		Arrays.sort(array);
		answer = array[array.length/2];
		return answer;
	}
}
