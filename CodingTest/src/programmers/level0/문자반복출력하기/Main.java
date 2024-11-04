package programmers.level0.문자반복출력하기;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < my_string.length(); i++) {
        	for(int j = 0; j < n; j++) {
        		sb.append(my_string.charAt(i));
        	}
        }
        System.out.println(sb);
        
        return new String(sb);
    }
}