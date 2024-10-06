package programmers.level0.OX퀴즈;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] tests = {"3 - 4 = -3", "5 + 6 = 11"}; 
		Solution s = new Solution();
		String[] str = s.solution(tests);
		for(String s1 : str) {
			System.out.println(s1);
		}
	}

}
class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i = 0; i < quiz.length; i++) {
        	String[] parts = quiz[i].split(" ");
        	
        	int X = Integer.parseInt(parts[0]);
        	int Y = Integer.parseInt(parts[2]);
        	int Z = Integer.parseInt(parts[4]);
        	
        	int result = parts[1].equals("+") ? X + Y : X - Y;
        
        	answer[i] = result == Z ? "O" : "X";
        
        }
        return answer;
    }
}