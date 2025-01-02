package ch01;

public class myFirstMain{

	public static void main(String args[]){
				 
		System.out.println("main() method 진입성공");
		test();

	}

	public static void test(){
		System.out.println("test() method 호출성공" );
		String message = "ABCDEFGHIJKLMNOPABCDEFGHIJKLMNOPABCDE";
		System.out.println(message);
	}

}