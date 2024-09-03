package ch03ch04;

import java.util.Scanner;

/**
 * 조건문
 * if(조건){
 *	조건을 만족시 실행코드
 * }
 * 
 * if(조건){
 * 	조건만족시 실행
 * }else{
 * 	조건 만족 x 실행
 * }
 * 
 * *비교연산자 
 * 1>10 
 * A>B A는 B보다 크다
 * A>=B A는 B보다 크커나 같다
 * A<B A는 B보다 작다
 * A<=B A는 B보다 작거나 같다
 * */
public class Ex01_if {
	public static void main(String[] args) {
		// 점수가 70점을 포함하여 크면 합격 
		// 70점 보다 작으면서 점수가 65점 이상이면 예비합격 
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		int score = Integer.parseInt(str);
		
		if(score>=70) {
			System.out.println("합격");
		}else if(score>=65){
			System.out.println("예비합격");
		}else {
			System.out.println("불합격");
		}
	}
}
