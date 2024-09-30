package level0.pizza2;

import java.nio.channels.Pipe;

public class Main {
    public static void main(String[] args) {
        /**
         * 머쓱이네 피자가게는 피자를 여섯 조각으로 잘라 줍니다. 
         * 피자를 나눠먹을 사람의 수 n이 매개변수로 주어질 때, 
         * n명이 주문한 피자를 남기지 않고 모두 같은 수의 피자 조각을 
         * 먹어야 한다면 최소 몇 판을 시켜야 하는지를 return 하도록 
         * solution 함수를 완성해보세요.
         */

         System.out.println(new Solution().solution(10));
    }
}

class Solution {
    private final int PIZZA = 6;
    private int count = 1;

    public int solution(int n) {
        return result(n);
    }

    private int result(int n){
        int result = 0;
        while(true){
            result = PIZZA * count;

            if(result % n == 0){
                break;
            }

            count++;
        }
        return count;
    }

}
