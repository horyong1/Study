package p2;

public class App {

	public static void main(String[] args) {
		new Solver().solver();
	}

}


class Solver{
	
	public void solver() {
		int[] primes = new PrimeGenerator().generatePrimes(100);
		for(int prime : primes) {
			System.out.println(prime);
		}
		
	}
		
}

class PrimeGenerator{
	private boolean[] crossedOut;
	private int[] result;
	
	public int[] generatePrimes(int maxValue) {
		if(maxValue < 2) {
			return new int[0];
		}
		unCrossIntegerUpTo(maxValue);
		crossOutMultiples();
		putUncrossedIntegerIntoResult();
		return result;
	}
	
	// 배열 초기화 
	private void unCrossIntegerUpTo(int maxValue) {
		crossedOut = new boolean[maxValue +1];
		for(int i = 2; i < crossedOut.length; i++){
			crossedOut[i] = false;
		}
		
	}
	// 채치기
	private void crossOutMultiples() {
		int limit = determineIterationLimit();
		for(int i = 2; i <= limit; i++) {
			if(notCrossed(i)) {
				crossOutMultiplesOf(i);
			}
		}
	}
	// maxValue 루트 값 까지 범위 값 생성 
	private int determineIterationLimit() {
		double iterationLimit = Math.sqrt(crossedOut.length); 
		return (int)iterationLimit;
	}
	
	private boolean notCrossed(int i) {
		return crossedOut[i] == false;
	}
	
	private void crossOutMultiplesOf(int i){
		for(int multiple = 2 * i; multiple < crossedOut.length; multiple += i) {
			crossedOut[multiple] = true;
		}
	}
	
	private void putUncrossedIntegerIntoResult() {
		result = new int[numberOfUncrossedIntegers()];
		for(int j = 0, i = 2; i < crossedOut.length; i++) {
			if(notCrossed(i)) {
				result[j] = i;
				j++;
			}
		}
	}
	
	private int numberOfUncrossedIntegers() {
		int count = 0;
		for(int i = 2; i < crossedOut.length; i++) {
			if(notCrossed(i)) {
				count++;
			}
		}
		return count; 
	}
	
}