package jungol.제곱수출력;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long x = sc.nextLong();
        long y = sc.nextLong();
        
        if (y == 0) {
            System.out.println(1);
        } else {
            System.out.println(Divide(x, y));
        }
        
        sc.close();
    }

    public static long Divide(long x, long y) {
        long mod = 20091024;

        if (y == 1) return x % mod;
        if (y % 2 == 0) {
            long half = Divide(x, y / 2) % mod;
            return (half * half) % mod;
        } else {
            long half = Divide(x, y / 2) % mod;
            return (half * half % mod * x % mod) % mod;
        }
    }
}