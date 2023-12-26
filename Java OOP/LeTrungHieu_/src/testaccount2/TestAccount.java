package testaccount2;

public class TestAccount {
	public static void main(String[] args) {
		Account account = new Account("Trung Nguyễn", 10000); 
		
		account.toString();
		account.withdraw(5000);
		account.deposit(1000000);
		account.Display();
	}
}
