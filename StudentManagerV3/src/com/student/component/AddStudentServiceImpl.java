package com.student.component;

import com.student.Ioutil.IoUtil;
import com.student.dto.StudentDto;
import com.student.repository.Repository;

public class AddStudentServiceImpl implements Service{
	private Repository repository;
	
	public void setRepository(Repository repository) {
		this.repository = repository;
	}
	@Override
	public void process() {
		
		IoUtil.print("====[학생 등록 시작]=====");
		
		StudentDto dto = inputStudentInfo();
		
		if(dto.getName().equals("!")) {
			testData();
			resultPrint();
			return;
		}	
		repository.add(dto);
		resultPrint();
		
	}
	/**
	 * 학생 정보 입력
	 * */
	private StudentDto inputStudentInfo() {
		String name = IoUtil.input("학생 이름 입력 >>>> ");
		int age = Integer.parseInt(IoUtil.input("학생 나이 입력 >>>> "));
		int score = Integer.parseInt(IoUtil.input("학생 점수 입력 >>>> "));
		return new StudentDto(name,age,score);
	}
	/**
	 * 학생 정보 완료 출력
	 * */
	private void resultPrint() {
		IoUtil.print("학생 정보가 등록 되었습니다.");
	}
	
	/**
	 * 시작 시 이름에 ! 입력하면 데이터 생성
	 * */
	private void testData() {
		String[] names = {"홍길동","김철수","이훈이","신짱구","홍길동","김미영","최팀장"};
		int[] ages = {13,27,35,45,53,45,45};
		int[] scores = {53,47,73,34,53,67,87};
		
		for(int i = 0; i < names.length; i++) {
			StudentDto studentdtos = new StudentDto(names[i], ages[i], scores[i]);
			repository.add(studentdtos);
		}
	
	}
}
