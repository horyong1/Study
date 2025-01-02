package programmers.basic.level0.세균증식;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Solution {
    public int solution(int n, int t) {
//        int answer = n;
//        for(int i = 1; i <= t; i++ ) {
//        	answer *= 2; 
//        }
    	int result = 0;
    	
    	result = n << t;
        return result;
    }
}