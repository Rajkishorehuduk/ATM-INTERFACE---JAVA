import java.util.*;

public class Account {
    private double balance;
    private List<Transaction> transactionHistory;

    public Account() {
        balance = 0.0;
        transactionHistory = new ArrayList<>();
    }

    public void deposit(double amount) {
        balance += amount;
        transactionHistory.add(new Transaction("Deposit", amount));
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            transactionHistory.add(new Transaction("Withdraw", amount));
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void transfer(Account receiver, double amount) {
        if (amount <= balance) {
            this.withdraw(amount);
            receiver.deposit(amount);
            transactionHistory.add(new Transaction("Transfer to another user", amount));
        } else {
            System.out.println("Transfer failed: insufficient balance.");
        }
    }

    public void printTransactionHistory() {
        for (Transaction t : transactionHistory) {
            System.out.println(t);
        }
    }

    public double getBalance() {
        return balance;
    }
}
