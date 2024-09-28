package programmers.basic.level0.짝수는_싫어요;


public class Main {

	public static void main(String[] args) {
	}

}

class Solution {
    public int[] solution(int n) {
        int index = 0;
        for(int i = 1; i <= n; i+=2) {
        	index++;
        }
        
        int[] answer = new int[index];  
        index = 0;
        for(int i = 0; i < n; i++) {
        	int num = i+1;
        	if(num % 2 != 0)
        	answer[index++] = i+1;
        }
        
        return answer;
    }
}
