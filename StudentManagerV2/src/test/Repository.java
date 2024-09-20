package test;

public class Repository {
	private StudentDto[] studentList = new StudentDto[10];
	private int cnt;
	
	public void count() {
		cnt++;
	}
	/**
	 * 학생 추가 
	 * */
	public void add(StudentDto studentDto) {
		if(studentList.length == cnt) {
			StudentDto[] newStudentList = new StudentDto[cnt * 2];
			
			for(int i = 0; i < studentList.length; i++) {
			 	newStudentList[i] = studentList[i];
			}
			
			studentList = newStudentList;
		}
		
		studentList[cnt] = studentDto;
		count();
	}
	/**
	 * 학생 전체 목록 검색
	 * */
	public StudentDto[] findAll() {
		return studentList;
	}
}
