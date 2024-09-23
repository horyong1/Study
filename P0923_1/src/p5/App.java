package p5;

public class App {
	public static void main(String[] args) {
		//863은 소수인가?
		new Solver().solve(863);
	}
}

// SOLID - SRP(단일 책임 원칙) : 하나의 메소드에 3줄이상 들어가면 안된다.
class Solver{
	
	public void solve(int value) {
		System.out.println(isPrime(value) ? "소수 입니다." : "소수가 아닙니다.");
	}
	
	private boolean isPrime(int value) {
		for(int i = 2; i <= Math.sqrt(value); i++ ) {
			if(isDivisible(value,i)) {
				return false;
			}
		}
		return true; 
	}
	
	private boolean isDivisible(int value1, int value2 ) {
		return value1 % value2 == 0;
	}
}
