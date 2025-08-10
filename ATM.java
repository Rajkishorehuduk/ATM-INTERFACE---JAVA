import java.util.*;

public class BankSystem {
    private Map<String, User> users = new HashMap<>();

    public void addUser(String userId, String pin) {
        users.put(userId, new User(userId, pin));
    }

    public User login(String userId, String pin) {
        User user = users.get(userId);
        if (user != null && user.validate(pin)) {
            return user;
        }
        return null;
    }

    public static void main(String[] args) {
        BankSystem bank = new BankSystem();

        bank.addUser("user1", "1234");
        bank.addUser("user2", "5678");

        User loggedIn = bank.login("user1", "1234");
        if (loggedIn != null) {
            System.out.println("Login successful! Welcome " + loggedIn.getUserId());
        } else {
            System.out.println("Invalid credentials.");
        }
    }
}
