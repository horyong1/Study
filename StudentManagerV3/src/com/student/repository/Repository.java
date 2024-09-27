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
		int searchCount = 0;
		for(int i = 0; i < count; i++) {
			if(studentList[i].getName().contains(name)) {
				searchCount++;
			}
		}

		StudentDto[] searchList = new StudentDto[searchCount];
		int index = 0;
		for(int i = 0; i < count; i++) {
			if(studentList[i].getName().contains(name)) {
				searchList[index] = studentList[i];
				index++;
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
				countMius();
				i--;
				removeCount++;
			}
		}
		return removeCount;
	}
	
	/**
	 * 학생 평균 점수
	 * */
	public double statistic() {
		int sum = 0;
		for(int i = 0; i < count; i++) {
			sum += studentList[i].getScore();
		}
		double result = (double)sum/count;
		return result;
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
