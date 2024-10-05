package programmers.level0.공배수;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution {
    public int solution(int number, int n, int m) {
        return ischeck(number, n) && ischeck(number, m) ? 1 : 0;
    }
    
    private boolean ischeck(int number, int n) {
    	return number % n == 0;
    }
}