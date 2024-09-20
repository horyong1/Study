package test;

import java.util.Scanner;



public class School{
	private int cnt;
	private StudentDto[] list = new StudentDto[5];
	Scanner sc = new Scanner(System.in);
	
	School() {
		
	}
		
	void start() {
		System.out.println("***************");
		System.out.println("** 학생정보프로그램 **");
		System.out.println("***************");
		
		while(true) {
			String key = menuPrint();
			
			if(key.equals("0")) {
				System.out.println("프로그램 종료.....");
				sc.close();
				break;
			}
			
			if(key.equals("1")) {
				System.out.print("여러명을 한번에 입력하시겠습니까?(Y/n) >>> ");
				String Yn = sc.nextLine();
				if(Yn.equals("Y") || Yn.equals("y")) {
					manyInput();
				}else {
					oneInput();					
				}
				
			}else if(key.equals("2")) {
				studentPrint();
			
			}else if(key.equals("3")) {
			
		
			}else if(key.equals("4")) {
		
			
			}else if(key.equals("5")) {
			
			}else {
				System.out.println("잘못 입력하셨습니다. 메뉴를 확인하시고 다시 입력해주세요.");
			}
			
			System.out.println("계속하시려면 엔터를 입력해주세요");
			sc.nextLine();
			sc.nextLine();
		}
		System.out.println("프로그램을 종료합니다. 감사합니다.");
	}
	
	void oneInput() {
		String name = sc.next();
		int age = sc.nextInt();
		int score = sc.nextInt();
		list[cnt] = new StudentDto(name,age,score);
		cnt++;
		System.out.println("정상적으로 입력 되었습니다.");
	}
	
	void manyInput() {
		
		System.out.println("학생정보를 입력하세요.");
		
		for(int i = cnt; i < list.length; i++) {
			String name = sc.next();
			int age = sc.nextInt();
			int score = sc.nextInt();
			list[i] = new StudentDto(name,age,score);
		}
		System.out.println("정상적으로 입력 되었습니다.");
		

	}
	
	String menuPrint() {
		System.out.println("=========== 메뉴 ===========");
		System.out.println("1. 학생 정보 입력");
		System.out.println("2. 학생 목록 출력");
		System.out.println("3. 학생 정보 검색");
		System.out.println("4. 학생 정보 삭제");
		System.out.println("5. 학생 통계 검색");
		System.out.println("0. 프로그램 종료");
		System.out.println("메뉴 입력 >>> ");
		String key = sc.nextLine();
		return key;
	}
	
	void studentPrint() {
		System.out.println("=================");
		for(StudentDto a : list) {
			System.out.println("학생 이름 : " + a.getName());
			System.out.println("학생 나이 : " + a.getAge());
			System.out.println("학생 점수 : " + a.getScore());
			System.out.println("=================");
		}
	}
}
