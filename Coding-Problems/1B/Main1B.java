class UserSession {
    private static UserSession instance;
    private boolean loggedIn;
    private String userName;

    // Private constructor to prevent instantiation from outside
    private UserSession() {
        loggedIn = false;
        userName = "";
    }

    // Public method to get the single instance of UserSession
    public static UserSession getInstance() {
        if (instance == null) {
            instance = new UserSession();
        }
        return instance;
    }

    // Method to log in the user
    public void login(String userName) {
        if (!loggedIn) {
            this.userName = userName;
            loggedIn = true;
            System.out.println(userName + " has logged in.");
        } else {
            System.out.println("User already logged in.");
        }
    }

    // Method to log out the user
    public void logout() {
        if (loggedIn) {
            System.out.println(userName + " has logged out.");
            loggedIn = false;
            userName = "";
        } else {
            System.out.println("No user is logged in.");
        }
    }

    // Method to check if the user is logged in
    public boolean isLoggedIn() {
        return loggedIn;
    }

    // Method to get the current user's name
    public String getUserName() {
        return loggedIn ? userName : "No user logged in";
    }
}

class BankOperations {
    private double balance;

    public BankOperations() {
        balance = 0.0;
    }

    public void viewBalance() {
        UserSession session = UserSession.getInstance();
        if (session.isLoggedIn()) {
            System.out.println("Current balance for " + session.getUserName() + ": $" + balance);
        } else {
            System.out.println("Please log in to view balance.");
        }
    }

    public void deposit(double amount) {
        UserSession session = UserSession.getInstance();
        if (session.isLoggedIn()) {
            balance += amount;
            System.out.println("Deposited $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Please log in to deposit money.");
        }
    }

    public void withdraw(double amount) {
        UserSession session = UserSession.getInstance();
        if (session.isLoggedIn()) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrew $" + amount + ". New balance: $" + balance);
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Please log in to withdraw money.");
        }
    }
}

public class Main1B {
    public static void main(String[] args) {
        UserSession session = UserSession.getInstance();
        session.login("John Doe");

        BankOperations bankOps = new BankOperations();

        bankOps.viewBalance();
        bankOps.deposit(500);
        bankOps.viewBalance();
        bankOps.withdraw(200);
        bankOps.viewBalance();

        session.logout();
        bankOps.viewBalance(); 
    }
}
