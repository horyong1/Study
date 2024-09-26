package com.student.repository;

import com.student.dto.StudentDto;

public class Repository {
	private StudentDto[] studentList = new StudentDto[5];
	private int count;
	
	public void add(StudentDto dto) {
		if(count == studentList.length) {
			StudentDto[] newStudentList = new StudentDto[count * 2];
			for(int i = 0;  i < count; i++) {
				newStudentList[i] = studentList[i];
			}
			studentList = newStudentList;
		}
		
		studentList[count] = dto;
		countPlus();
	}
	
	public StudentDto[] findAll() {
		StudentDto[] newStudentList = new StudentDto[count];
		for(int i = 0; i < count; i++) {
			newStudentList[i] = studentList[i];
		}
		return newStudentList;
	}
	
	public StudentDto[] findByName(String name) {
		int cnt = 0;
		for(int i = 0; i < count; i++) {
			if(studentList[i].getName().contains(name)) {
				cnt++;
			}
		}

		StudentDto[] tempList = new StudentDto[cnt];
		int index = 0;
		for(int i = 0; i < count; i++) {
			if(studentList[i].getName().contains(name)) {
				tempList[index] = studentList[i];
			}
		}
		
		return tempList;
	}
	private void countPlus() {
		count++;
	}
	
	private void countMius() {
		count--;
	}
	
	public int getCount() {
		return this.count;
	}
	
}
