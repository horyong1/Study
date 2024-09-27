package com.student.component;

import com.student.Ioutil.IoUtil;
import com.student.dto.StudentDto;
import com.student.repository.Repository;

public class SearchStudentServiceImpl implements Service {
	
	private Repository repository;
	
	public void setRepository(Repository repository) {
		this.repository = repository;
	}

	@Override
	public void process() {
		IoUtil.print("=====[학생 검색]=====");
		String name = IoUtil.input("검색할 학생 이름 >>> ");
		StudentDto[] dtos = repository.findByName(name);
		
		if(dtos == null) {
			IoUtil.print("학생이 없습니다.");
			return;
		}
		
		searchStudentListPrint(dtos);
	}
	
	private void searchStudentListPrint(StudentDto[] dtos) {
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
		IoUtil.print(dtos.length + "명이 검색 되었습니다.");
	}
	
	



}
