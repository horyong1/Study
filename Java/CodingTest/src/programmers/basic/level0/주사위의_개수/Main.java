package programmers.basic.level0.주사위의_개수;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        answer = (box[0] / n) * (box[1] / n) * (box[2] / n);
        
        
        
        return answer;
    }
}