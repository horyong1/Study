package com.student.repository;

import com.student.dto.StudentDto;

public class Repository {
	private StudentDto[] studentList = new StudentDto[5];
	private int count;
	
	public int getCount() {
		return this.count;
	}
	/**
	 * 학생 정보 추가
	 * */
	public void add(StudentDto dto) {
		createNewArray();
		studentList[count] = dto;
		countPlus();
	}
	
	/**
	 * 학생 전체 목록 
	 * */
	public StudentDto[] findAll() {
		StudentDto[] newStudentList = new StudentDto[count];
		for(int i = 0; i < count; i++) {
			newStudentList[i] = studentList[i];
		}
		return newStudentList;
	}
	
	/**
	 * 학생 검색 목록
	 * */
	public StudentDto[] findByName(String name) {
		int searchCount = findByNameSearchCount(name);
		StudentDto[] searchList = new StudentDto[searchCount];
		return findByNameSearchList(searchList, name);
	}
	
	/**
	 * 학생 선택 삭제 
	 * */
	public int removeByName(String name) {
		return removeStudentCount(name);
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
	
	/**
	 * 학생 정보 초과 시 기존 2배 크기 새로운 저장소 생성(배열)
	 * */
	private void createNewArray() {
		if(count == studentList.length) {
			StudentDto[] newStudentList = new StudentDto[count * 2];
			for(int i = 0;  i < count; i++) {
				newStudentList[i] = studentList[i];
			}
			studentList = newStudentList;
		}
	}
	
	/**
	 * 학생 검색 시 배열 카운트 값
	 * */
	private int findByNameSearchCount(String name) {
		int searchCount = 0;
		for(int i = 0; i < count; i++) {
			if(studentList[i].getName().contains(name)) {
				searchCount++;
			}
		}
		return searchCount;
	}
	/**
	 * 학생 검색 후 새 배열에 복사 하여 반환
	 * */
	private StudentDto[] findByNameSearchList(StudentDto[] dtos,String name) {
		int index = 0;
		for(int i = 0; i < count; i++) {
			if(studentList[i].getName().contains(name)) {
				dtos[index] = studentList[i];
				index++;
			}
		}
		return dtos;
	}
	
	/**
	 * 학생 선택 삭제 후 카운트 반환
	 * */
	private int removeStudentCount(String name) {
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
	
	private void countPlus() {
		count++;
	}
	
	private void countMius() {
		count--;
	}
	
	
	
}
