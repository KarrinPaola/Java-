package testaccount;

public class testAccount {
    public static void main(String[] args) {
        // Tạo đối tượng Account
        Account myAccount = new Account("MyAccount", 1000.0);

        // Hiển thị thông tin tài khoản
        System.out.println("Initial Account Information:");
        myAccount.showInfor();

        // Nạp tiền vào tài khoản
        myAccount.deposit(500.0);
        System.out.println("\nAccount Information after Deposit:");
        myAccount.showInfor();

        // Rút tiền từ tài khoản
        myAccount.withdraw(200.0);
        System.out.println("\nAccount Information after Withdrawal:");
        myAccount.showInfor();
    }
}
