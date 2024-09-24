package com.ja.stm.repository;

import com.ja.stm.dto.StudentDto;

/**
 * Repository = 데이터 저장소 : 데이터 입출력관리
 * */
public class Repository {
	//StudentDto 자료관리
	private StudentDto[] studentList = new StudentDto[5];
	private int count;
	
	public int count() {
		return count;
	}
	
	/**
	 * 학생 등록
	 * */
	public void append(StudentDto studentdto) {
		
		if(count == studentList.length) {
			StudentDto[] newStudentList = new StudentDto[count * 2];
			for(int i = 0; i < count; i++) {
				newStudentList[i] = studentList[i]; 
			}
			studentList = newStudentList;
		}
		
		studentList[count] = studentdto;
		count++;
	}
	
	/**
	 * 학생 전체 목록 반환
	 * */
	public StudentDto[] findAll() {
		StudentDto[] copyStudentList = new StudentDto[count];
		for(int i = 0; i < count; i++) {
			// 공부용으로 이렇게 값 설정해서 넘기기 
			// 나중엔 데이터 베이스로 관리해서 이렇게 하는법만 알아두기
			StudentDto  studentdto = new StudentDto();
			studentdto.setName(studentList[i].getName());
			studentdto.setAge(studentList[i].getAge());
			studentdto.setScore(studentList[i].getScore());
			copyStudentList[i] = studentdto;
		}
		return copyStudentList;
	}
	
	/**
	 * 학생 검색 목록 반환
	 * */
	public StudentDto[] findByName(String name) {
		int searchCount = 0;
		for(int i = 0; i < count; i++) {
			String tempname = studentList[i].getName();
			if(tempname.equals(name)) {
				searchCount++;
			}
		}
		
		StudentDto[] searchList = new StudentDto[searchCount];
		int newindex = 0;
		for(int i = 0; i < count; i++) {
			String tempname = studentList[i].getName();
			if(tempname.equals(name)) {
				StudentDto  studentdto = new StudentDto();
				studentdto.setName(studentList[i].getName());
				studentdto.setAge(studentList[i].getAge());
				studentdto.setScore(studentList[i].getScore());
				
				searchList[newindex] = studentdto;
				newindex++;
			}
		}
		return searchList;	
	}
	
	/**
	 * 학생 선택 삭제 
	 * */
	public int removeByName(String name) {
		int removeCount = 0;
		for(int i = 0; i < count; i++) {
			if(studentList[i].getName().equals(name)) {
				for(int j = i; j < count-1; j++) {
					studentList[j] = studentList[j+1]; 
				}				
				count--;
				i--;
				removeCount++;
			}
		}
		return removeCount;
	}
	
	

}
