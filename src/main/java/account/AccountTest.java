package account;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("Chris", 20.00);
        account1.deposit(3);
        account1.withdraw(5);
        account1.getBalance();
    }
}
