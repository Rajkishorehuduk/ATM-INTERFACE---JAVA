public class Transaction {
    private String type;
    private double amount;
    private Account fromAccount;
    private Account toAccount;

    public Transaction(String type, double amount, Account fromAccount, Account toAccount) {
        this.type = type;
        this.amount = amount;
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
    }

    public boolean process() {
        switch (type) {
            case "transfer":
                if (fromAccount.withdraw(amount)) {
                    toAccount.deposit(amount);
                    return true;
                }
                return false;
            case "deposit":
                fromAccount.deposit(amount);
                return true;
            case "withdraw":
                return fromAccount.withdraw(amount);
            default:
                return false;
        }
    }
}
