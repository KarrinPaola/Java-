package testaccount;

public class Account {
	
	private String nameString; 
	private double balance; 
	
	public Account(String nameString, double balance) {
		this . nameString = nameString; 
		this . balance = balance;  
	}
	public void showInfor() {
		System.out.println(nameString);
		System.out.println(balance);
	}
	
	public void withdraw(double amount) {
		if(balance > 0 && amount <= balance) {
			balance -= amount; 
			System.out.println("Withdrawal of $" + amount + " successful."); 
		}else {
			System.out.println("Invalid withdrawal amount or insufficient funds.");
		}
	}
	
	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount; 
			System.out.println("Deposit of $" + amount + "successful."); 
		}else {
			System.out.println("Invalid deposit amount.");
		}
	}
	public double getBalance() {
		return balance; 
	}

}
