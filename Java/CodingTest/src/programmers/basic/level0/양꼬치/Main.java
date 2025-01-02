package programmers.basic.level0.양꼬치;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Solution {
    public int solution(int n, int k) {
        int lamTotalPrice = totalPrice(Menu.LAMB, n);
        int drinkTotalPice = totalPrice(Menu.DRINK, k) - drinkDiscount(Menu.DRINK,k);
//        int yangPrice = 12000;
//        int drinkPice = 2000;
//        answer = (n * yangPrice) + ((k - n/10) * drinkPice);
        
        return lamTotalPrice + drinkTotalPice;
    }
    
    private int totalPrice(Menu menu, int quantity) {
    	return menu.getPrice() * quantity;
    }
    
    private int drinkDiscount(Menu menu, int quantity) {
    	int result = (quantity / 10) * menu.getPrice();
    	return result;
    	
    }
}

enum Menu {
	LAMB("양꼬치", 12000),
	DRINK("음료수", 2000);
	
	private final String name;
	private final int price;

	Menu(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
}