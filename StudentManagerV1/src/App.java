import java.util.Arrays;
import java.util.Scanner;

/**
 * 추석 까지
 * 공부 방법 : 아래 예제 완벽한 이해, 알고리즘 문제 풀이
 * [ 아래 예시 관련 ]
 * 1. 이해해 보려고 노력 
 *    만약 완벽하게 이해 되었으면, 기획부터.. 무언가 만드세요.
 *    만약 완벽하게 이해 되었으면, 아래 문제를 푸세요.
 *    
 * 2. 이해에 어려움을 겪고 있다면, 무엇을 모르는지 점검을 해볼 것.
 *	  주변분들과 혹인 동영상, 책 참고하여 공부하기.
 *	  이해에 어려움을 겪고 있으면, 반복해볼 것 ... 코드 짜는 순서 생각해서 반복
 *	  
 * */
public class App {

	public static void main(String[] args) {
		// 프로그래밍 구현 순서 : 요구사항 분석(정의),
		// 데이터 설계, 코드 구조, 구현, 테스팅
		Scanner sc = new Scanner(System.in);

		int cnt = 0;
		String[] nameList = new String[5];
		int[] ageList = new int[5];
		int[] scoreList = new int[5];
		int[] indexList = new int[5];
		
		System.out.println("************************");
		System.out.println("*      학생 관리 프로그램     *");
		System.out.println("*      버전: 1.0         *");
		System.out.println("*      작성자:이호룡        *");
		System.out.println("************************");
		
		while(true) {
			System.out.println("=========== 메뉴 ===========");
			System.out.println("1. 학생 정보 입력");
			System.out.println("2. 학생 목록 출력");
			System.out.println("3. 학생 정보 검색");
			System.out.println("4. 학생 정보 삭제");
			System.out.println("5. 학생 통계 검색");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("커맨드 입력 >>> ");
			String command = sc.nextLine();
			
			// 프로그램 종료
			if(command.equals("0")) {
				System.out.println("[테스트] 프로그램 종료 로직 수행.");
				break;
			}
			
			// 프로그램 실행
			if(command.equals("1")) {
				String studentName = "";
				String tempAge = "";
				String tempScore = "";
				int studentAge = 0;
				int score = 0;
				
				System.out.println("[학생 정보 입력 로직 시작]");
				while(true) {
					System.out.print("학생 이름 입력 >>> ");
					studentName = sc.nextLine();
					
					if(studentName.length() < 2) {
						System.out.println("이름을 정확히 다시 입력해주세요");
					}else {
						break;
					}
				}

				while(true) {	
					//Q.숫자가 아닌 문자가 입력되었을때, 에러문구 출력 및 재 입력
					System.out.print("학생 나이 입력 >>> ");
					tempAge = sc.nextLine();
					char [] arr = tempAge.toCharArray();
					int num = 0;
					for(int i = 0; i < arr.length ; i++) {
						if( arr[i] >= '0' && arr[i] <= '9') {
							num++;
						}else {
							num =0;
							System.out.println("잘못입력 하셨습니다. 다시입력해 주세요 ");
							break;
						}
					}
					if(num >=1) {
						studentAge = Integer.parseInt(tempAge);
						break;
					}
				}
				
				//Q.100초과 0미만 값이 입력되었을 때, 값은 100 또는 0사이의 정수여야 합니다. 출력
				//Q.숫자가 아닌 문자가 입력되었을때, 에러문구 출력 및 재 입력
				while(true) {	
					System.out.print("학생 점수 입력 >>> ");
					tempScore = sc.nextLine();
					char [] arr = tempScore.toCharArray();
					int num = 0;
					for(int i = 0; i < arr.length ; i++) {
						if( arr[i] >= '0' && arr[i] <= '9') {
							num++;
						}else {
							num =0;
							System.out.println("잘못입력 하셨습니다. 다시입력해 주세요 ");
							break;
							
						}
					}
					
					if(num >= 1) {
						score = Integer.parseInt(tempScore);
						if(score >= 0 && score <= 100) {
							break;
						}else {
							System.out.println("100초과 0미만 값이 입력되었을 때, 값은 100 또는 0사이의 정수여야 합니다.");
						}
					}
				}
				int t = sc.nextInt();
		
				
				// ArrayList - 내부구조
				if(nameList.length == cnt) {
					String[] newNameList = new String[cnt * 2];
					int[] newAgeList = new int[cnt * 2];
					int[] newScoreList = new int[cnt * 2];
					int[] newIndexList = new int[cnt * 2];
					
					for(int i = 0; i < cnt; i++) {
						newNameList[i] = nameList[i];
						newAgeList[i] = ageList[i];
						newScoreList[i] = scoreList[i];
						newIndexList[i] = indexList[i];
					}
					
					nameList = newNameList;
					ageList = newAgeList;
					scoreList = newScoreList;
					indexList = newIndexList;
				}
		
				if(t == 1 ) {
					String[] name = {"홍길동","김철수","이영희","GPT","홍길동"};
					for(int i = 10; i < 15; i++) {
						indexList[cnt] = cnt+1;
						nameList[cnt] = name[cnt];
						ageList[cnt] = i;
						scoreList[cnt] = i;	
						cnt++;
						
					}
				}else {
					nameList[cnt] = studentName;
					ageList[cnt] = studentAge;
					scoreList[cnt] = score;
					indexList[cnt] = cnt+1;
					
					cnt++;
				}
				
				
				
//				if(cnt == nameList.length) {
//					nameList = Arrays.copyOf(nameList, cnt+1);
//					ageList = Arrays.copyOf(ageList, cnt+1);
//					scoreList = Arrays.copyOf(scoreList, cnt+1);
//				}
				System.out.println("학생정보가 정상적으로 입력되었습니다.");
					
				
			}else if(command.equals("2")) {
				System.out.println("[학생 목록 출력 시작]");
				// Q. '점수를 기준으로 내림차순으로 출력할까요?(Y/n)'
				System.out.print("점수를 기준으로 내림차순으로 출력할까요?(Y/n) >>> ");
				String yn = sc.nextLine();
				
				if(yn.equals("Y") || yn.equals("y")) {
					String[] tempName = new String[cnt];
					int[] tempAge = new int[cnt];
					int[] tempScore = new int[cnt];
					for(int i = 0; i < cnt; i++) {
						tempName[i] = nameList[i];
						tempAge[i] = ageList[i];
						tempScore[i] = scoreList[i];
					}
					
					for(int i = 0; i < cnt-1; i++) {
						for(int j = i+1 ; j < cnt; j++) {
							if(tempScore[i] < tempScore[j]) {
								String tname = tempName[i];
								tempName[i] = tempName[j];
								tempName[j] = tname;

								int tage = tempAge[i];
								tempAge[i] = tempAge[j];
								tempAge[j] = tage;
								
								int tscore = tempScore[i];
								tempScore[i]=tempScore[j];
								tempScore[j] = tscore;

							}
						}
					}
					System.out.println("--------------------");
					for(int i = 0; i < cnt; i ++) {
						System.out.println("순번 : " + indexList[i]);
						System.out.println("학생이름 : " + tempName[i]);
						System.out.println("학생나이 : " + tempAge[i]);
						System.out.println("학생점수 : " + tempScore[i]);
						System.out.println("--------------------");
					}
					
				}else {
					System.out.println("--------------------");
					for(int i = 0; i < cnt; i++) {
						System.out.println("순번 : " + indexList[i]);
						System.out.println("학생이름 : " + nameList[i]);
						System.out.println("학생나이 : " + ageList[i]);
						System.out.println("학생점수 : " + scoreList[i]);
						System.out.println("--------------------");
					}					
				}
				System.out.println("총학생수 : " + cnt);
				
			}else if(command.equals("3")) {
				System.out.println("[학생 정보 검색 시작]");
				
				System.out.print("검색할 학생 이름 입력 >>> ");
				String searchStudentName = sc.nextLine();
				System.out.println("--------------------");
				char[] tempSearchName = searchStudentName.toCharArray();
				
				int searchCnt = 0;
				int charCnt = 0;
				for(int i = 0; i < cnt; i++) {
					//Q.contains 사용하지 말고 알고리즘으로 변경
					for(int j = 0; j < searchStudentName.length(); j++ ) {
						char temp = nameList[i].charAt(j); 
						if(charCnt == 3) {
							break;
						}else if(temp == tempSearchName[j]) {					
							charCnt++;
						}
						
					}
					if(charCnt >= 3) {
						System.out.println("학생이름 : " + nameList[i]);
						System.out.println("학생나이 : " + ageList[i]);
						System.out.println("학생점수 : " + scoreList[i]);
						System.out.println("--------------------");
						searchCnt ++;
					}
					charCnt = 0;
				}
				
				if(searchCnt == 0 ) {
					System.out.println("학생 정보가 없습니다. 학생 정보를 다시 확인해주세요.");
				}else {
					System.out.println("검색된 학생의 수 : " + searchCnt);					
				}
				
			}else if(command.equals("4")) {
				System.out.println("[학생 정보 삭제 시작]");
				
				System.out.print("삭제할 학생 이름 입력 >>> ");
				String deleteStudentName = sc.nextLine();
				int deleteCnt = 0;
				int dcount = 0;
				int[] tempindex = new int[cnt];
				
				System.out.println("--------------------");
				for(int i = 0; i < cnt; i++) {
					if(nameList[i].equals(deleteStudentName)) {
						tempindex[dcount] = indexList[i];
						dcount++;
						System.out.println("번호 : " + dcount);
						System.out.println("학생이름 : " + nameList[i]);
						System.out.println("학생나이 : " + ageList[i]);
						System.out.println("학생점수 : " + scoreList[i]);
						System.out.println("--------------------");
					}
				}
				
				if(dcount > 1) {
					
					while(true) {
						System.out.println("중복된 학생이 확인되었습니다. 학생을 확인하시고 삭제하려는 학생 번호를 하시고 ");
						System.out.print("돌아가시려면 n을 입력해주세요. >>> ");
						String yn = sc.nextLine();
						
						if(yn.equals("n") || yn.equals("N")) {
							System.out.println("학생 삭제를 취소 합니다.");
							break;
						}else{
							int num = Integer.parseInt(yn);
							for(int i = 0; i < cnt; i++) {
								if(tempindex[num-1] == indexList[i] && 
										deleteStudentName.equals(nameList[i])) {
									for(int j = i; j < cnt-1; j++) {
										nameList[j] = nameList[j+1];
										ageList[j] = ageList[j+1];
										scoreList[j] = scoreList[j+1];
									}
									indexList[cnt-1] = 0;
									cnt--;
									deleteCnt++;
								}
							}
						}
						if(deleteCnt > 0) {
							System.out.println("학생 "+deleteStudentName+ " 정보 삭제 완료.");
							break;
						}else {
							System.out.println("삭제에 실패하였습니다. 다시시도해주세요 ");
							break;
						}
						
					}
				}else if(dcount == 1) {
					while(true) {
						System.out.println("해당 학생이 확인되었습니다. 이 학생을 삭제 하겠습니까?(Y/n)");					
						String deleteYn = sc.nextLine();
						if(deleteYn.equals("y") || deleteYn.equals("Y")) {
							
							//Q. 해당 학생이 확인되었습니다. 이 학생을 삭제 하겠습니까?(Y/n)
							//Q. 중복 값 있는경우 리스트 출력 후 1번 학생 삭제 2번학생 삭제 번호로 삭제
							for(int i = 0; i < cnt; i++) {
								if(nameList[i].equals(deleteStudentName)) {
									for(int j = i; j < cnt-1; j++) {
										nameList[j] = nameList[j+1];
										ageList[j] = ageList[j+1];
										scoreList[j] = scoreList[j+1];
									}
									cnt--;
									i--;
									deleteCnt++;
								}
							}
							System.out.println("학생 "+deleteCnt + "명이 삭제 되었습니다.");
							System.out.println("학생 정보 삭제 완료.");
							break;
							
						}else if(deleteYn.equals("n") || deleteYn.equals("N")){
							System.out.println("학생 삭제를 취소 합니다.");
							break;
							
						}else {
							System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
						}
					}
				
				}
				
			}else if(command.equals("5")) {
				System.out.println("[학생 통계 검색 시작]");
				// 합계 계산
				int sum = 0;
				for(int i = 0; i <cnt; i++) {
					sum += scoreList[i];
				}
				// 평균 계산
				// Q. 소수점 2자리 까지만 나오게 
				double average = Math.round(((double)sum/cnt)*100)/100.0;
				
			
				System.out.println("--------------------");
				System.out.println("총 학생 수 : " + cnt );
				System.out.println("평균 점수 : " + average );
				System.out.println("--------------------");
				
			}else {
				System.out.println("잘못된 명령어입니다. 다시 입력해주세요.");
			}
			
			System.out.println("계속 하시려면 enter를 입력해주세요.");
			sc.nextLine();
		}
		
		sc.close();
		
		System.out.println("프로그램을 이용해 주셔서 감사합니다.");

	}

}
