package programmers.basic.level0.나이출력;

public class Main {

	public static void main(String[] args) {
		System.out.println(new Solution().solution(40));
		
	}

}

class Solution {
    public int solution(int age) {
        int answer = 2022 - age +1 ;
        
        return answer;
    }
}