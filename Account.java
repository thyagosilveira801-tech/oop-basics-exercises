// ==============================================================================
// Activity: Introduction to OOP - Designing an Account Class with Encapsulation
// Module 2: OOP. Basic Concepts I (Java Paradigms)
// ==============================================================================

public class Account {

    // Class attributes encapsulated via private visibility flags
    private String holder;
    private String accountNumber;
    private double balance;

    // Constructor method: Handles memory initialization and argument mapping
    public Account(String holder, String accountNumber, double balance) {
        this.holder = holder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Accessor "Getters" (Exposing specific data states safely)
    public String getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

    // Main routine runner context
    public static void main(String[] args) {
        
        // 1. Instantiating two unique Account object instances in memory
        Account account1 = new Account("John Doe", "12345-6", 1500.50);
        Account account2 = new Account("Mary Smith", "98765-4", 2700.00);

        // Displaying initial structural balances inside the console
        System.out.println("Balance for " + account1.getHolder() + ": $ " + account1.getBalance());
        System.out.println("Balance for " + account2.getHolder() + ": $ " + account2.getBalance());
        System.out.println("------------------------------------------------");

        // 2. Control flow routing comparing instances state conditions
        if (account1.getBalance() > account2.getBalance()) {
            System.out.println(account1.getHolder() + "'s account holds a higher balance.");
        } else if (account2.getBalance() > account1.getBalance()) {
            System.out.println(account2.getHolder() + "'s account holds a higher balance.");
        } else {
            System.out.println("Both account states hold identical balances.");
        }
    }
}
