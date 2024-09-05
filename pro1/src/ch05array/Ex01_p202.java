package ch05array;

import java.util.Scanner;

/**
 * 배열(Array)-p200
 * -같은 타입의 데이터를 연속된 공간에 나열하고,
 *  각 데이터에 index를 부여해놓은 자료구조
 *
 * 배열특징
 * -같은 타입 => 배열의 단점
 * -연속된 공간 => index.0부터 1씩 증가
 * 
 * */
public class Ex01_p202 {
	public static void main(String[] args) {
		 
		double beforeTime = System.currentTimeMillis();
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 공간을 정해주세요 : ");
		int num = sc.nextInt();
		int[] score = new int[num];
		
		System.out.println("배열 값을 차례로 입력해주세요");
		for(int i = 0; i< score.length; i++) {
			
			score[i] = sc.nextInt();
		}
		sc.close();
		
		System.out.println("해당 배열의 값을 출력합니다.");
		for( int a : score) {
			System.out.println(a);
		}
		
		double afterTime = System.currentTimeMillis();
		double secDiffTime = (afterTime - beforeTime)/10000;
		System.out.println("프로그램 실행 시간(m) " + secDiffTime + "초");
	}
}
