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
		String[] names = {"홍길동","김철수","이훈이","신짱구","홍길동","김미영","최팀장"};
		int[] ages = {13,27,35,45,53,45,45};
		int[] scores = {53,47,73,34,53,67,87};
		
		for(int i = 0; i < names.length; i++) {
			StudentDto studentdtos = new StudentDto(names[i], ages[i], scores[i]);
			repository.add(studentdtos);
		}
	
	}
}
