public class User {
    private String userId;
    private String pin;
    private Account account;

    public User(String userId, String pin) {
        this.userId = userId;
        this.pin = pin;
        this.account = new Account();
    }

    public boolean validate(String inputPin) {
        return this.pin.equals(inputPin);
    }

    public Account getAccount() {
        return account;
    }

    public String getUserId() {
        return userId;
    }
}
