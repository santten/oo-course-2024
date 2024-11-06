package W3_3_T1;

public class BankAccount {
    private int balance;
    private final int accountNumber;

    private static int totalAccounts;

    public BankAccount(int initialSum) {
        totalAccounts++;
        this.accountNumber = totalAccounts;
        this.balance = initialSum;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int sum) {
        this.balance = sum;
    }

    public void deposit(int amt) {
        setBalance(getBalance() + amt);
    }

    public void withdraw(int amt) {
        setBalance(getBalance() - amt);
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }
}