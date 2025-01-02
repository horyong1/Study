package programmers.level0.제곱수_판별하기;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(new Solution().solution(976));
	}

}

class Solution {
    public int solution(int n) {
        return n % (int)Math.sqrt(n) == 0 ? 1 : 2; 
        
    }
}