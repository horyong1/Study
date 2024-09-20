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
			
			for(int i = 0; i < cnt; i++) {
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
		
	public StudentDto[] findByName(String name) {
		StudentDto[] studentDtos = new StudentDto[cnt];
		int count = 0;
		for(int i = 0; i < cnt; i++) {
			if(studentList[i].getName().equals(name)) {
			studentDtos[count] = studentList[i];
				count++;
			}
		}
		return studentDtos;
	}
	
	public boolean removeByName(String name) {
		boolean isDelete = false;
		for(int i = 0; i < cnt-1; i++) {
			if(studentList[i].getName().equals(name)) {				
				for(int j = i; j < cnt; j++) {
					studentList[j] = studentList[j+1];  
				}
				cnt--;
				isDelete = true;
			}
			
		}
		return isDelete;
	}
}
