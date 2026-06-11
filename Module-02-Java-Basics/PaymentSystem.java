import java.util.Scanner;

// --- BASE CLASS (PARENT) ---
class PaymentMethod {
    // Generic method to be overridden by subclasses
    public void processPayment(double amount) {
        System.out.println("Processing a generic payment of: €" + amount);
    }
}

// --- SUBCLASS: CREDIT CARD (CHILD) ---
class CreditCard extends PaymentMethod {
    private String cardNumber;

    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    // Polymorphic method override focusing on Credit Card context
    @Override
    public void processPayment(double amount) {
        System.out.println("💳 [Credit Card] Payment of €" + amount + " processed successfully!");
        System.out.println("Details: Charged to card ending in (***" + 
                           cardNumber.substring(Math.max(0, cardNumber.length() - 4)) + ").");
    }
}

// --- SUBCLASS: PAYPAL (CHILD) ---
class PayPal extends PaymentMethod {
    private String accountEmail;

    public PayPal(String accountEmail) {
        this.accountEmail = accountEmail;
    }

    // Polymorphic method override focusing on PayPal context
    @Override
    public void processPayment(double amount) {
        System.out.println("📲 [PayPal] Authenticating secure transaction of: €" + amount);
        System.out.println("Success: Invoice sent to registered email (" + this.accountEmail + ").");
    }
}

// --- MAIN EXECUTION ENTRY POINT ---
public class PaymentSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=========================================");
        System.out.println("             PAYMENT SYSTEM              ");
        System.out.println("=========================================\n");

        System.out.print("Enter the amount to be paid (€): ");
        double transactionAmount = scanner.nextDouble();
        scanner.nextLine(); // Clear buffer

        System.out.println("\nAvailable Payment Methods:");
        System.out.println("[1] Credit Card");
        System.out.println("[2] PayPal");
        System.out.print("Select the desired option: ");
        int option = scanner.nextInt();
        scanner.nextLine(); // Clear buffer

        // Declaring the base class reference variable (Crucial for Polymorphism)
        PaymentMethod selectedPayment;

        if (option == 1) {
            System.out.print("\nEnter Credit Card number: ");
            String cardNum = scanner.nextLine();
            // Instance polymorphism: assigning sub-object to parent type
            selectedPayment = new CreditCard(cardNum);
        } else if (option == 2) {
            System.out.print("\nEnter PayPal account email: ");
            String email = scanner.nextLine();
            // Instance polymorphism: assigning sub-object to parent type
            selectedPayment = new PayPal(email);
        } else {
            System.out.println("\n❌ Invalid Option! Using default gateway.");
            selectedPayment = new PaymentMethod();
        }

        System.out.println("\n================ PROCESSING ================");
        // Runtime Polymorphism: trigger correct method version dynamically based on instance type
        selectedPayment.processPayment(transactionAmount);
        System.out.println("=============================================");

        scanner.close();
    }
}
