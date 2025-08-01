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
}
