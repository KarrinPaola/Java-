package testaccount2;import java.awt.desktop.AboutHandler;

public class Account {
	private String nameString; 
	private double balance; 
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	public Account(String nameString) {
		this.nameString = nameString; 
	}
	
	public Account(String nameString, double balance) {
		this.nameString = nameString; 
		this.balance = balance; 
	}
	
	public void setName(String nameString) {
		this.nameString = nameString; 
	}
	public void setBalance(double balance) {
		this.balance = balance; 
	}
	public String getName() {
		return this.nameString; 
	}
	public Double getBalance() {
		return this.balance; 
	}
	public void Display() {
		System.out.println("Name: " + nameString); 
		System.out.println("Balance: " + balance); 
	}
	public void withdraw(double amount) {
		if(amount > 0 && balance > amount) {
			this.balance -= amount; 
			System.out.println("Withdraw Successful. Your balance now is " + balance); 
		}else {
			System.out.println("Withdraw Failed"); 
		}
	}
	public void deposit(double amount) {
		if(amount > 0) {
			this.balance += amount; 
			System.out.println("Deposit Successful. Your balance now is " + balance); 
		}else {
			System.out.println("Deposit Failed"); 
		}
	}
}
