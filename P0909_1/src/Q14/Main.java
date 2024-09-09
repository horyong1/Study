package Q14;

public class Main {
	public static void main(String[] args) {

		int[] arr = {500,100,50,10};
		int money = 3210;
		
		int i = 0;
		int num;
		while(money > 0) {
			num = money/arr[i];
			
			if(num == 0) {
				i++;
				continue;
			}
			
			System.out.println(arr[i]+"원 짜리 " + num +"개");
			money = money -num*arr[i];
			i++;
		}
	}
}
