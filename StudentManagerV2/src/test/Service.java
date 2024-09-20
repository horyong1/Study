package test;

public class Service {
	private Repository repository = new Repository();
	
	public void addStudent() {
		String name = IoUtil.input("학생 이름 입력");
		int age = Integer.parseInt(IoUtil.input("학생 나이 입력"));
		int score = Integer.parseInt(IoUtil.input("학생 점수 입력"));
		
		StudentDto dto = new StudentDto(name, age, score);
		repository.add(dto);
	}
	
	public void showStudentList() {
		StudentDto[] studentDtos = repository.findAll();
		
		System.out.println("=======================");
		for(StudentDto studentDto : studentDtos) {
			
			if(studentDto == null || studentDto.getName() == null) {
				break;
			}
			
			IoUtil.print("학생 이름 : " + studentDto.getName());
			IoUtil.print("학생 나이 : " + studentDto.getAge());
			IoUtil.print("학생 점수 : " + studentDto.getScore());
			System.out.println("=======================");
		}
	}
	
	public void seachStudent(String name) {
		StudentDto[] studentDto = repository.findByName(name);

		System.out.println("=======================");
		for(StudentDto student : studentDto) {
			if(student == null || student.getName() == null) {
				break;
			}
			
			IoUtil.print("학생 이름 : " + student.getName());
			IoUtil.print("학생 나이 : " + student.getAge());
			IoUtil.print("학생 점수 : " + student.getScore());
			System.out.println("=======================");
		}
	}
	
	public void removeStudent(String name) {
		boolean isDelete = repository.removeByName(name);
		
		if(isDelete) {
			IoUtil.print("정상적으로 삭제 되었습니다.");
		}else {
			IoUtil.print("등록된 학생이 아닙니다. 다시 한번 확인 해 주세요");
			
		}
		
	}
}
