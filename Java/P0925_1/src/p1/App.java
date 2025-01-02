package p1;

public class App {

	public static void main(String[] args) {
		// 2~100사이의 소수는 무엇인가?
		
		// 인덱스 값을 숫자로 생각하고 true false로 나눔
		boolean[] arr = new boolean[101];
		
		// false로 초기화 논리적으로 표현해줘야 좋음
		for(int i = 2; i< arr.length; i++) {
			arr[i] = false;
		}
		
		// 체치기 1~10까지 배수들을 찾아 true로 바꾸고 소수값들만 false로 남도록 하는 로직
		for(int i = 2; i <= Math.sqrt(arr.length); i++) {
			if(arr[i] == false) {
				for(int x = 2 * i ; x < arr.length; x += i) {
					arr[x] = true;
				}
			}
		}
		
		for(int i = 2; i < arr.length; i++) {
			if(arr[i] == false) {
				System.out.println(i);
			}
		}
		
		
		
	}

}

//class이론
// 캡슐화 = 정보의 은닉 = private 
// 응집도는 높이고, 결합도는 낮춘다.
// 응집도 = 있어야될 속성, 기능이 뭉쳐야된다.
// 좋은 코드를 만드는 방법 : SOLID 원칙(5원칙이라고도 불림)
// 항상 시작은 SRP, SRP만 잘 다뤄도 
