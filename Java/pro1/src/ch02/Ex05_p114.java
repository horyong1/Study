package ch02;

/**
 * 키보드에서 입력된 내용을 변수에 저장하기
 * System.in.read() 사용하려면 예외처리를 해줘야함 
 * */
public class Ex05_p114 {
	public static void main(String[] args) throws Exception {
		int keyCode;
		int cnt = 0;
		System.out.print("한글자를 입력하세요 : ");
		
//		keyCode = System.in.read();
//		System.out.println("keyCode :::: " + keyCode);
//
//		keyCode = System.in.read();
//		System.out.println("keyCode :::: " + keyCode);
//		
//		keyCode = System.in.read();
//		System.out.println("keyCode :::: " + keyCode);
		// 조건을 충족하는 동안 반복문은 실행
		// 무한루프에 빠지지 않도록 주의해야한다.
//		while(true) {
//			keyCode = System.in.read();
//			System.out.println("keyCode :::: " + keyCode);
//			cnt++;
//			if(cnt >10) {
//				System.out.println("종료");
//				break;
//			}
//			
//		}
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode :::: " + keyCode);
			if(keyCode == 113) {
				System.out.println("종료");
				break;
			}
		
		}
	}
}
