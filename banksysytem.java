import java.util.HashMap;
import java.util.Map;

public class BankSystem {
    private Map<String, User> users;

    public BankSystem() {
        users = new HashMap<>();
    }

    public void addUser(User user) {
        users.put(user.getUserId(), user);
    }

    public User authenticateUser(String userId, String pin) {
        User user = users.get(userId);
        if (user != null && user.authenticate(pin)) {
            return user;
        }
        return null;
    }
}
