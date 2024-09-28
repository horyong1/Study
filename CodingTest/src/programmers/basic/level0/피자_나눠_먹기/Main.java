package programmers.basic.level0.피자_나눠_먹기;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Solution {
    public int solution(int n) {
        int answer = 0;
        int pizza = n / 7;
        int sum = pizza * 7;
        
        answer = n > sum ? pizza + 1 : pizza; 
        return answer;
    }
}