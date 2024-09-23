package ch02;

import java.util.Scanner;

/**
 * 키보드에서 입력된 내용을 문자열로 얻기
 * */
public class Ex06_p118 {
	public static void main(String[] args) {
		String inputData;
		// 클래스명 참조변수 = (주소) new 클래스명()
		// Scanner 클래스의 객체를 생성하여 참조sc에 주소를 저장
		Scanner sc = new Scanner(System.in);
		
		//참조 sc를 이용하여 Scanner클래스의 nextLine() method를 호출
		//문자열을 읽어 String 타입의 변수 iputData에 저장
		while(true) {
			System.out.print("이름을 입력하세요.");
			System.out.println(" 종료는 q입력하세요");
			inputData =sc.nextLine();
			if(inputData.equals("q")) {
				System.out.println("종료.");
				break;
			}
			
			if(inputData.equals("Q")) {
				System.out.println("종료.");
				break;
			}
			
			System.out.println("이름은 : " + inputData);
		}
		
		}
	}

