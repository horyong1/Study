package com.student.controller;

import com.student.Ioutil.IoUtil;
import com.student.component.Service;
import com.student.container.ServiceContainer;

public class Controller {
	ServiceContainer serviceContainer = new ServiceContainer();
	
	public void run() {
		hello();
		while(true) {
			showCommandMenu();
		
			String command = IoUtil.input("메뉴 입력 >>>> ");
			
			if(isExitCode(command)) {
				break;
			}
			
			processCommand(command);
		}
		bye();
	}
	
	public void hello() {
		IoUtil.print("=========================");
		IoUtil.print("====== 학생 관리 프로그램 ======");
		IoUtil.print("====== Ver.3       ======");
	}
	
	public void bye() {
		IoUtil.print("프로그램을 이용해주셔서 감사합니다.");
	}

	public void showCommandMenu() {
		IoUtil.print("=========================");
		IoUtil.print("1. 학생 정보 입력");	
		IoUtil.print("2. 학생 목록 출력");	
		IoUtil.print("3. 학생 검색 ");	
		IoUtil.print("4. 학생 정보 삭제");	
		IoUtil.print("5. 학생 평균 점수");	
		IoUtil.print("0. 학생 정보 입력");
		
	}
	
	public void processCommand(String command) {
		Service service = serviceContainer.get(command);
		if(service != null) {
			service.process();
			IoUtil.pause();
		}else {
			IoUtil.print("잘못된 입력입니다......");
			IoUtil.pause();
		}
	}
	
	private boolean isExitCode(String command) {
		return command.equals("0");
	}
	
}
