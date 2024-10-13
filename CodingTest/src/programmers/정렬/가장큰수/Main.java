package programmers.정렬.가장큰수;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		
	}
}

class Solution{
	public String solution(int[] numbers) {
		String[] strNumbers = Arrays.stream(numbers)
								.mapToObj(String::valueOf)
								.toArray(String[]::new);
		Arrays.sort(strNumbers, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
		
		if(strNumbers[0].equals("0")) {
			return "0";
		}
		
		StringBuilder answer = new StringBuilder();
		for(String s : strNumbers) {
			answer.append(s);
		}
		return answer.toString();
	}
}

//class Solution {
//    public String solution(int[] numbers) {
//        List<String> list = new ArrayList<>();
//        
//        for(int n : numbers) {
//        	list.add(String.valueOf(n));
//        }
//        
//        Collections.sort(list,new Comparator<String>() {
//			@Override
//			public int compare(String o1, String o2) {
//				String str1 = o1 + o2;
//				String str2 = o2 + o1;
//				return str2.compareTo(str1);
//			}
//        	
//		});
//        
//        String answer = "";
//        for(String s : list) {
//        	answer += s;
//        }
//        
//       
//        return answer.startsWith("0") ? "0" : answer;
//    }
//}