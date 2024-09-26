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
		String name = IoUtil.input("학생 이름 입력 >>>> ");
		
		if(name.equals("!")) {
			testData();
			resultPrint();
			return;
		}
		
		int age = Integer.parseInt(IoUtil.input("학생 나이 입력 >>>> "));
		int score = Integer.parseInt(IoUtil.input("학생 점수 입력 >>>> "));
		
		repository.add(new StudentDto(name,age,score));
		resultPrint();
		
	}
	
	
	private void resultPrint() {
		IoUtil.print("학생 정보가 등록 되었습니다.");
	}
	
	private void testData() {
		String[] names = {"홍길동","김철수","이훈이","신짱구","홍길동"};
		int[] ages = {10,20,30,40,50};
		int[] scores = {10,20,30,40,50};
		
		for(int i = 0; i < 5; i++) {
			StudentDto studentdtos = new StudentDto(names[i], ages[i], scores[i]);
			repository.add(studentdtos);
		}
	
	}
}
