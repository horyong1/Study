package com.ja.stm.dto;


/**
 * Dto = Data Transfer Object : 데이터 형태 정의 클래스
 * 필드만 중요
 * */
public class StudentDto {
	private String name;
	private int age;
	private int score;
	
	public StudentDto() {
		
	}
	public StudentDto(String name, int age, int score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
	
}
