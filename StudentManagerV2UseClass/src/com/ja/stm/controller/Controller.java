package com.ja.stm.controller;

import com.ja.stm.service.Service;
import com.ja.stm.util.IoUtil;

/**
 * Controller - 흐름 담당
 * SRP = 단일 책임 원칙
 * - 로직을 글로 변환 = 왜? 읽기 쉽게 하려고 
 * */
public class Controller {
	// Service와의 결합
	private Service service = new Service();
	
	
	public void run() {
		hello();
		
		while(true) {
			menu();
			String commend = selectCommand();
			
			
			if(isExitCode(commend)) {
				break;
			}
			
			branchFlowByCommend(commend);
		}
		bye();
		
	}
	
	// SRP = 단일 책임 원칙
	private void hello() {
		IoUtil.print("==============================");
		IoUtil.print("========= 학생 관리 프로그램 ========");
		IoUtil.print("=========    Ver.2    ========");
		IoUtil.print("========= 작성자 : 이호룡  ========");
		
	}
	
	private void bye() {
		IoUtil.print("프로그램이 종료됩니다.");
		IoUtil.print("이용해 주셔서 감사합니다.");
	}
	
	private void menu() {
		IoUtil.print("==============================");
		IoUtil.print("1. 학생 정보 등록");
		IoUtil.print("2. 학생 목록 출력");
		IoUtil.print("3. 학생 검색");
		IoUtil.print("4. 학생 정보 삭제");
		IoUtil.print("5. 학생 점수 통계");
		IoUtil.print("0. 프로그램 종료");
		
	}
	
	public void branchFlowByCommend(String commend) {
		switch(commend) {
		case "1":
			service.registerStudent();
			IoUtil.pause();
			break;
		case "2":
			service.showStudentList();
			IoUtil.pause();
			break;
		case "3":
			service.searchStudent();
			IoUtil.pause();
			break;
		case "4":
			service.removeStudent();
			IoUtil.pause();
			break;
		case "5":service.statistic();
			IoUtil.pause();
			break;
		default:
			IoUtil.print("잘못 입력 하셨습니다. 다시 입력해주세요.....");
			IoUtil.pause();
			break;
		}
	}
	
	private String selectCommand() {
		String key = IoUtil.input("커맨드 입력 >>>> ");
		return key;
	}
	
	private boolean isExitCode(String commend) {
		return commend.equals("0");
	}
}
