package test;

public class Wrapper {
	private Service service = new Service();
	
	public void run() {
		hello();
		while(true) {
			showCommandMenu();
			
			String key = IoUtil.input("메뉴 입력");
			if(key.equals("0")) {
				IoUtil.print("프로그램 종료");
				break;
			}
			
			switch(key) {
				case "1":
					service.addStudent();
					IoUtil.pause();
					break;
				case "2":
					service.showStudentList();
					IoUtil.pause();
					break;
				case "3":
					String searchName = IoUtil.input("검색 학생 이름 입력");
					service.seachStudent(searchName);
					IoUtil.pause();
					break;
				case "4":
					String deleteName = IoUtil.input("검색 학생 이름 입력");
					service.removeStudent(deleteName);
					IoUtil.pause();
					break;
				case "5":
					break;
				default:
					IoUtil.print("잘못된 입력입니다. 다시 입력 해 주세요");
					IoUtil.pause();
					break;
			}
		}
	}
	
	public void hello() {
		IoUtil.print("***************************");
		IoUtil.print("******** 학생정보프로그램 ********");
		IoUtil.print("******** 작성자: 이호룡 ********");
		IoUtil.print("******** Ver: 2.0  ********");
		IoUtil.print("***************************");
	}
	
	public void bye() {
		IoUtil.print("프로그램을 종료합니다. 감사합니다.");
	}
	
	public void showCommandMenu() {
		IoUtil.print("=========== 메뉴 ===========");
		IoUtil.print("1. 학생 정보 입력");
		IoUtil.print("2. 학생 목록 출력");
		IoUtil.print("3. 학생 정보 검색");
		IoUtil.print("4. 학생 정보 삭제");
		IoUtil.print("5. 학생 통계 검색");
		IoUtil.print("0. 프로그램 종료");
		
	}
}
