package S2;

// Notes:

// Class is a blueprint to create objects.
// Object is instance of a class. => Key concept of OOP
// We can create objects based on classes.

// Class Content: Data & Actions
// Data: Also knows as Variables, properties, but also constants
// Actions: Methods, sometime called functions. Something that object can do.


// Constructors: used to create the class, Keyword -> new

public class Account {
    private String owner;
    private double balance;
    private double minBalance;

    public void deposit(double ammount) {
        // Code Logic here
    }

    public void withdraw(double ammount) {
        // Code Logic here
    }

    public double calculateCreditWorthiness() {
        // Logic here
        return 77;
    }

    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getMinBalance() {
        return minBalance;
    }
    public void setMinBalance(double minBalance) {
        this.minBalance = minBalance;
    }
}
