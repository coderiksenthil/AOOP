package main.auth;

public class AuthenticationManager {
    private static AuthenticationManager instance;

    private AuthenticationManager() {
        // Private constructor to prevent instantiation
    }

    public static AuthenticationManager getInstance() {
        if (instance == null) {
            synchronized (AuthenticationManager.class) {
                if (instance == null) {
                    instance = new AuthenticationManager();
                }
            }
        }
        return instance;
    }

    public void authenticateUser(String username, String password) {
        // Logic for user authentication
        System.out.println("Authenticating user: " + username);
    }
}
