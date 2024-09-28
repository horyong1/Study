package programmers.basic.level0.개미_군단;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Solution {
    public int solution(int hp) {
        int answer = 0;
        int damege = 5;
        
        while(hp > 0) {
        	answer += hp/damege;
        	hp %= damege;
        	damege -=2;
        }
        return answer;
    }
}