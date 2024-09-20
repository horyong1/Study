package test;

public class Service {
	private Repository repository;
	
	public void addStudent() {
		String name = IoUtil.input("학생 이름 입력");
		int age = Integer.parseInt(IoUtil.input("학생 나이 입력"));
		int score = Integer.parseInt(IoUtil.input("학생 점수 입력"));
		
		StudentDto dto = new StudentDto(name, age, score);
		repository.add(dto);
	}
	
	public void showStudentList() {
		StudentDto[] s = repository.findAll();
		for(StudentDto d : s) {
			
		}
	}
	
	public void seachStudent() {
		
	}
	
	public void removeStudent() {
		
	}
}
