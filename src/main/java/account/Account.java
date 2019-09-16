package account;

public class Account {
    public String costomerName;
    public double accountBalance;

    public Account(String costomerName, double accountBalance) {
        this.costomerName = costomerName;
        this.accountBalance = accountBalance;
    }

    public void deposit(int hunt) {
        accountBalance = accountBalance + hunt;
    }

    public void withdraw(int takeOut) {
        if (accountBalance < takeOut) {
            System.out.println("Insufficent funds");
        } else {
            accountBalance -= takeOut;
            System.out.println(accountBalance);
        }

    }
    public void getBalance(){
        System.out.println(accountBalance);
    }
}
