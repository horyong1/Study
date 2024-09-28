package programmers.basic.level0.각도기;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution {
    public int solution(int angle) {
        int answer = 0;
        if(angle > 0 && angle < 90) {
        	return 1;
        }
        if(angle == 90) {
        	return 2;
        }
        if(angle > 90 && angle < 180) {
        	return 3;
        }
        if(angle == 180) {
        	return 4;
        }
        
        return answer;
    }
}