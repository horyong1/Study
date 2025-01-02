package programmers.basic.level0.연속된_수의_합;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        int start = (total/num) - (num-1) / 2;
        
        for(int i = 0; i < num; i++) {
        	answer[i] = start + i;
        }
        return answer;
    }
}