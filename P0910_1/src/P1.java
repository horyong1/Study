/**
 * 데이터를 묶어서 관리하기 위해 배열을 사용 
 * for문을 이용하여 데이터 관리
 * 단점 
 * - 무한이나 가변적으로 크기를 변경 할 수 없음 
 * - 
 * [] <- 접근 연산자
 * Stack heap 나눈이유는 메모리가 사라지는 경우가 다름
 * 모든 지역 변수는 Stack에 쌓인다.
 * 스코프{} 벗어나면 소멸된다.
 * new 는 heap영역 메모리에 생성된다. 
 * heap은 heap영역에 있는 주소를 가르키는 변수가 없을때 지워짐
 * 배열을 사용하고 heap영역에서만 지우고 싶다면 
 * null을 이용하여 stack에만 남기고 heap에선 지울 수 있다.
 * heap 영역은 개발자가 다룰수 없는 부분이라 가비지 컬렉터가 지운다.
 * 
 * */
public class P1 {
	public static void main(String[] args) {
		// 배열....
		int[] qqq = null;
		{
			int[] studentScoreList = new int[5];
			// 0번지 주소에 10값을 넣ㅎ는다 
			studentScoreList[0] = 10;
			studentScoreList[1] = 10;
			studentScoreList[2] = 10;
			studentScoreList[3] = 10;
			studentScoreList[4] = 10;
			qqq = studentScoreList;
			
			studentScoreList[4] = 101;
			qqq[4]=1;
			System.out.println(studentScoreList[4]);
			System.out.println(qqq[4]);
		}
		for(int a : qqq) {
			System.out.println(a);
		}
		System.out.println(qqq);
		
		
		int[] arr1 = new int[3];
		int[] arr2 = new int[4];

		int[][] arr3 = new int [4][3];
		arr3[2] = new int [5];
		for( int [] a : arr3) {
			for( int as : a) {
				System.out.print(as+" ");
			}
			System.out.println();
		}
		
				
	}
}
