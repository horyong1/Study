package p02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentDto[] studentDtos = new StudentDto[5];
		for(int i = 0; i < studentDtos.length; i++) {
			String name = sc.next();
			int age = sc.nextInt();
			int score = sc.nextInt();
			studentDtos[i] = new StudentDto(name, age, score); 
		}
		
		for(StudentDto s : studentDtos) {
			System.out.print(s.getName() + " ");
			System.out.print(s.getAge() + " ");
			System.out.print(s.getScore());
			System.out.println();
		}
		
		
	}
	
}


class StudentDto{
	private String name;
	private int age;
	private int score;
	
	public StudentDto(String name, int age, int score) {
		super();
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