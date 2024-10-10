package programmers.level0.잘라서_배열로_저장하기;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		String[] str = s.solution("abc1Addfggg4556b", 6);
		
		for(String sd : str ) {
			System.out.println(sd);
		}
	}

}
/**
 * 문자열 my_str과 n이 매개변수로 주어질 때,
 *  my_str을 길이 n씩 잘라서 저장한 배열을 return하도록 solution 함수를 완성해주세요.
 * */
class Solution {
    public String[] solution(String my_str, int n) {
    	int index = 0;
    	
    	if(my_str.length()% n ==0) {
    		index = my_str.length()/n;
    	}else {
    		index = my_str.length()/n + 1;
    	}
    	
        String[] answer = new String[index];
        for(int i = 0; i < my_str.length(); i += n) {
        	if(i + n < my_str.length()) {
        		answer[i/n] = (my_str.substring(i, i + n));
        	}else {
        		answer[i/n] = my_str.substring(i);
        	}
        }
        return answer;
    }
}