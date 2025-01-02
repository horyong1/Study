package programmers.level0.pizza3;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int solution(int slice, int n) {
        return  (n + (slice - 1)) / slice;
    }
}