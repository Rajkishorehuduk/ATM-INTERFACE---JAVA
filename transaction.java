import java.time.LocalDateTime;

public class Transaction {
    String type;
    double amount;
    LocalDateTime date;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
        this.date = LocalDateTime.now();
    }

    public String toString() {
        return date + " - " + type + ": ₹" + amount;
    }
}
