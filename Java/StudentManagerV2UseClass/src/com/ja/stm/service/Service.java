package com.ja.stm.service;

import com.ja.stm.dto.StudentDto;
import com.ja.stm.repository.Repository;
import com.ja.stm.util.IoUtil;

/**
 * Service -  비즈니스 로직 담당
 * */
public class Service {
	// Repository와의 결합
	private Repository repository = new Repository();

	/**
	 * 학생 정보 등록
	 * */	
	public void registerStudent() {
		IoUtil.print("[학생 등록]");
		String name = IoUtil.input("학생 이름 >>> ");
		
		if(name.equals("!")) {
			String[] names = {"홍길동","김철수","이훈이","신짱구","홍길동"};
			int[] ages = {10,20,30,40,50};
			int[] scores = {10,20,30,40,50};
			for(int i = 0; i < 5; i++) {
				StudentDto studentdtos = new StudentDto(names[i], ages[i], scores[i]);
				repository.append(studentdtos);
			}
			return;
		}
		
		int age = Integer.parseInt(IoUtil.input("학생 나이 >>> ")); 
		int score =Integer.parseInt(IoUtil.input("학생 점수 >>> "));
		StudentDto studentdto = new StudentDto(name, age, score);
		repository.append(studentdto);
		
		IoUtil.print("학생이 등록 되었습니다.");
		
	}
	
	/**
	 * 학생 전체 목록 리스트
	 * */
	public void  showStudentList() {
		IoUtil.print("[학생 전체 검색]");
		StudentDto[] studentList = repository.findAll();
		studentList(studentList);
		IoUtil.print("검색된 학생의 수 : " + studentList.length);
	}
	
	/**
	 * 학생 검색 리스트
	 * */
	public void searchStudent() {
		IoUtil.print("[학생 검색]");
		String name = IoUtil.input("검색할 학생 이름 입력 >>> ");
		StudentDto[] searchList = repository.findByName(name);
		studentList(searchList);
		
	}
	
	/**
	 * 학생 정보 삭제
	 * */
	public void removeStudent() {
		IoUtil.print("[학생 정보 삭제]");
		String name = IoUtil.input("삭제할 학생 이름 입력 >>> ");
		int removeCount = repository.removeByName(name);
		IoUtil.print("학생 "+removeCount+ "명이 삭제 되었습니다.");
	}
	
	/**
	 * 학생 평균 점수
	 * */
	public void statistic() {
		IoUtil.print("[학생 통계]");
		StudentDto[] studentList = repository.findAll();
		
		int sum = 0;
		for(StudentDto studentDto : studentList) {
			sum += studentDto.getScore();
		}
		
		double avg = (sum/(double)studentList.length);
		IoUtil.print("==============================");
		IoUtil.print("총 인원	: " + studentList.length);
		IoUtil.print("평균	: " + avg);
		IoUtil.print("==============================");
	}
	
	/**
	 * 학생 목록 출력
	 * */
	private void studentList(StudentDto[] list) {
		if(isEmpty(list)) {
			IoUtil.print("학생정보가 없습니다.");
			return;
		}
		
		IoUtil.print("==============================");
		for(StudentDto student : list) {
			if(student == null || student.getName() == null) {
				continue;
			}
			IoUtil.print("학생 이름	 : " + student.getName());
			IoUtil.print("학생 나이	 : " + String.valueOf(student.getAge()));
			IoUtil.print("학생 점수	 : " + String.valueOf(student.getScore()));
			IoUtil.print("==============================");;
		}
	}
	
	/**
	 * 리스트가 빈 객체인지 확인 메서드
	 * */	
	private boolean isEmpty(StudentDto[] studentList) {
		boolean isEmpty = true;
		
		for (StudentDto student : studentList) {
			if (student != null) {
				isEmpty = false;
				break;
			}
		}
		return isEmpty;
	}
}
