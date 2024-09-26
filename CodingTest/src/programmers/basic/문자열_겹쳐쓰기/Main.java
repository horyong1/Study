package programmers.basic.문자열_겹쳐쓰기;

public class Main {

	public static void main(String[] args) {
		System.out.println(new Solution().solution("Program29b8UYP", "merS123", 7));
		
	}

}
class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
		char[] change = my_string.toCharArray();
		String answer = "";

		for(int i = 0; i < overwrite_string.length(); i++) {
			change[s+i] = overwrite_string.charAt(i);
		}
				
		for(char c : change ) {
			answer += c;
		}
		
        return answer;
    }
}