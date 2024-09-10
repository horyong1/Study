/**
 * String도 참조여서 주소를 받고 값이 들어가 있는 구조지만 리터럴로 값을 받을때 리소스에 따로 분리 해서
 * 같은 주소를 가르키게 최적화 되어있다. 그래서 String 타입에 리터럴 변수를 == 비교 연산을 하면 값이 같다면 
 * true가 나온다 . 
 * new String으로 생성할 경우 주소를 참조 하는경우이고 heap 영역에 각자 메모리가 할당되어 
 * == 연산을 하게되면 서로 다른 주소를 가르키기때문에 false를 반환한다.
 * 이때는 equals()메소드를 이용하여 값을 비교하면 true가 반환된다.
 *  
 * */
public class P3 {

	public static void main(String[] args) {
		// String...
		int a = 10;
		int b = 10;
		if(a == b) {
			System.out.println("a와 b는 같다");
		}else {
			System.out.println("a와 b는 다르다");
			
		}
		
		String str1 = new String("안녕");
		String str2 = new String("안녕");
		if(str1.equals(str2)) {
			System.out.println("str1와 str2는 같다");
		}else {
			System.out.println("str1와 str2는 다르다");
			
		}
		
		
	
	}

}
