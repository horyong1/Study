
public class Main {
	public static void main(String[] args) {
		String str = "안13녕7하88세요";
		
		char[] arr = str.toCharArray();
		char aa = '9';
		
		for(int i = 0; i< arr.length; i++) {
			if( arr[i] >= '0' || arr[i] <= '9') {
				System.out.println(arr[i]);
			}
		}
		System.out.println((int)aa);
////		for(char a : arr) {
////			System.out.println(a);
//		}
	}
}
