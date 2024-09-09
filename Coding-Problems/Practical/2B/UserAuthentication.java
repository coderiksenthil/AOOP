
public class UserAuthentication {
    private static UserAuthentication instance;

    private UserAuthentication() {
        // Private constructor to prevent instantiation
    }

    public static UserAuthentication getInstance() {
        if (instance == null) {
            synchronized (UserAuthentication.class) {
                if (instance == null) {
                    instance = new UserAuthentication();
                }
            }
        }
        return instance;
    }

    public void authenticateUser(String username, String password) {
        // Authentication logic
        System.out.println("Authenticating user: " + username);
    }
}

