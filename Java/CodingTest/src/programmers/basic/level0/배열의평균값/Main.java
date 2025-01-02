package programmers.basic.level0.배열의평균값;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
//        for(int i : numbers) {
//        	answer += i;
//        }
//        return answer / numbers.length;
        return Arrays.stream(numbers).average().orElse(0);
    }
}