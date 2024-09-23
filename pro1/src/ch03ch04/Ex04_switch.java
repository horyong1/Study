package ch03ch04;

/**
 * switch(조건식){
 * 		case 값:
 * 			실행코드
 * 			break;
 * 		default:
 * 			실행코드
 * 			break; 
 * }
 * 같은 코드면 묶어서 조건식을 정리 할 수 있음
 * */
public class Ex04_switch {
	public static void main(String[] args) {
		int month = 3;
		switch(month) {
		case 1:
		case 2:
		case 12:
			printD(month);
			break;
		case 3:
		case 4:
		case 5:
			printA(month);
			break;
		case 6:
		case 7:
		case 8:
		case 9:
			printB(month);
			break;
		case 10:
		case 11:
			printC(month);
			break;
		}
	}
	
	
	public static void printA(int n) {
		System.out.println(n + "월 봄입니다..");
	}
	public static void printB(int n) {
		System.out.println(n + "월 여름입니다..");
	}
	public static void printC(int n) {
		System.out.println(n + "월 가을입니다..");
	}
	public static void printD(int n) {
		System.out.println(n + "월 겨울입니다..");
	}
}
