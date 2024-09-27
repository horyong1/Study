package com.student.component;

import com.student.Ioutil.IoUtil;
import com.student.dto.StudentDto;
import com.student.repository.Repository;

public class ShowStudentServiceImpl implements Service {
	private Repository repository;
	
	public void setRepository(Repository repository) {
		this.repository = repository;
	}
	
	@Override
	public void process() {
		StudentDto[] dtos =  repository.findAll();
		if(dtos == null) {
			IoUtil.print("학생이 없습니다.");
			return;
		}
		studentListPrint(dtos);
		
	}
	
	/**
	 * 학생 정보 출력
	 * */
	private void studentListPrint(StudentDto[] dtos) {
		IoUtil.print("=========================");
		for(StudentDto s : dtos) {
			if( s == null || s.getName() == null) {
				break;
			}
			IoUtil.print("학생 이름 : " + s.getName());
			IoUtil.print("학생 나이 : " + String.valueOf(s.getAge()));
			IoUtil.print("학생 점수 : " + String.valueOf(s.getScore()));
			IoUtil.print("=========================");
		}
		IoUtil.print(repository.getCount() + "명이 검색 되었습니다.");
	}
	
}
