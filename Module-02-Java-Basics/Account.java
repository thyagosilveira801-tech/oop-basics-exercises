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

    // Accessor Methods (Getters) to selectively expose internal object states safely
    public String getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

    // Execution entry point
    public static void main(String[] args) {
        
        // Instantiating distinct objects with personalized parameters
        Account account1 = new Account("John Doe", "12345-6", 1500.50);
        Account account2 = new Account("Jane Smith", "98765-4", 2700.00);

        // Displaying initial state summaries via standard console lines
        System.out.println("Balance for " + account1.getHolder() + ": $ " + account1.getBalance());
        System.out.println("Balance for " + account2.getHolder() + ": $ " + account2.getBalance());
        System.out.println("------------------------------------------------");

        // Evaluative sequence to compare instance attributes
        if (account1.getBalance() > account2.getBalance()) {
            System.out.println("The account held by " + account1.getHolder() + " contains a higher balance.");
        } else if (account2.getBalance() > account1.getBalance()) {
            System.out.println("The account held by " + account2.getHolder() + " contains a higher balance.");
        } else {
            System.out.println("Both monetary records balance evenly.");
        }
    }
}
