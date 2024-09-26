package programmers.basic.더_크게_합치기;

public class Main {
	public static void main(String[] args) {
		System.out.println(new Solution().solution(9, 91));
	}
}
class Solution{
	public int solution(int a, int b) {
		int answer = abc(a,b);
		
		return answer;
	}
	private int abc(int a, int b) {
		String str1 = valueOf(a);
		String str2 = valueOf(b);
		int result1 = parseInt(str1, str2);
		int result2 = parseInt(str2, str1);
		
		if(result1 > result2) {
			return result1; 			
		}
		
		if(result1 < result2) {
			return result2; 			
		}
		
		return result1;
	}
	
	private String valueOf(int a) {
		return String.valueOf(a);
	}
	private int parseInt(String str1, String str2) {
		int result = Integer.parseInt(str1 + str2); 
		return result;
	}
}
