package programmers.basic.level0.아이스_아메리카노;

public class Main {

	public static void main(String[] args) {
		System.out.println(new Solution().solution(15000));
	}

}
class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int price = 5500;

        answer[0] = money / price;
       	answer[1] = money % price;
        
        return answer;
    }
}