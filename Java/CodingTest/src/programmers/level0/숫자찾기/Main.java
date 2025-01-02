package programmers.level0.숫자찾기;

import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution {
    public int solution(int num, int k) {
//        String numStr = String.valueOf(num);
//        String kStr = String.valueOf(k);
//        
//        return IntStream.range(0, numStr.length())  // 인덱스 범위 생성
//                .filter(i -> numStr.charAt(i) == kStr.charAt(0))  // k와 일치하는 값 필터
//                .map(i -> i + 1)
//                .findFirst()  // 첫 번째 매칭된 인덱스를 찾음
//                .orElse(-1) + 1;  // 없으면 -1, 있으면 인덱스에 +1
    	return ("-"+num).indexOf(String.valueOf(k));
    }
}