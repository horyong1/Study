
/**
 * 변수 : 기본타입/참조타입 기본 타입 
 * - 정수 : byte short int long 
 * - 실수 : float, double 
 * - 문자 : char(실제론 정수타입) 
 * - 논리 : boolean *String은 참조타입 (char로 이루어져있다)
 * 
 * Stack 메모리 할당, 해제에 대한 이해(스코프) 
 * 타입 캐스팅, 프로모션
 */

public class P1 {

	public static void main(String[] args) {
		int q = (int) 10.0;	// 타입 캐스팅 가능하나 정보 손실 가능성 있어 권
		double w = 10;	// 자동 캐스팅
		String r = "안녕";
		
		int a = 10;
		int b = 20;
		{
			int c = 30;
			
		}

	}

}
