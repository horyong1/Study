package programmers.level0.문자열_섞기;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Solution().solution("aaaaa", "bbbbb"));
	}

}

class Solution{
	public String solution(String str1, String str2) {
		String answer = stringPlus(str1, str2); 
		return answer;
	}
	
	private String stringPlus(String str1, String str2) {
		String result = "";
		for(int i = 0; i < str1.length(); i++) {
			result += str1.charAt(i);
			result += str2.charAt(i);
		}
		return result;
	}
}
