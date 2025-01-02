package programmers.basic.level0.옹알이1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] speak = {"aya", "ye", "woo", "ma" };
        
        for(String str : babbling) {
        	String result = str;
        	
        	
        	for(String s : speak) {
        		result = result.replace(s, " ");
        	}
        	
        	if(result.trim().isEmpty()) {
        		answer++;
        	}
        }
        return answer;
    }
}