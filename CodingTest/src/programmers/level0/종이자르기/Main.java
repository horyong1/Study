package programmers.level0.종이자르기;

public class Main {
	public static void main(String[] args) {
		
	}
}
class Solution {
    public int solution(int M, int N) {
        int answer = (M-1) + (N-1) * M;
        
        return answer;
    }
}