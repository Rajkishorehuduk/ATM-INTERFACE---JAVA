public class User {
    private String userId;
    private String pin;
    private Account account;

    public User(String userId, String pin, Account account) {
        this.userId = userId;
        this.pin = pin;
        this.account = account;
    }

    public String getUserId() {
        return userId;
    }

    public boolean authenticate(String inputPin) {
        return this.pin.equals(inputPin);
    }

    public Account getAccount() {
        return account;
    }
}
