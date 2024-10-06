package programmers.level0.문자열안에_문자열;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Solution {
    public int solution(String str1, String str2) {
        
        return str1.contains(str2) ? 1 : 2;
    }
}