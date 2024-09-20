package p3;

public class App {

	public static void main(String[] args) {

		Account account = new Account();
		account.deposit(5000);
	}

}

class Account{
	private String owner;
	private int balance;
	
	void withdraw(int value) {
		balance += value;
		
	}
	
	void deposit(int value) {
		if(balance < value) {
			System.out.println("잔액이 부족합니다.");
			System.out.println("현재 잔액 : " + balance);
			return;
		}
			balance -= value;
			
	}
	public void withDraw(int value) {
		if(checkBalance(value)) {
			System.out.println("잔액이 부족합니다.");
		}
		
	}
	
	
	public boolean checkBalance(int value) {
		return balance >= value;
	}
	
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}
