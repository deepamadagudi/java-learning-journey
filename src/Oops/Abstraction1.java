package Oops;

// ── INTERFACE — 100% abstraction (pure contract) ──────────────────
interface Payable {
    void processPayment(double amount); // no body — just the rule
    String getPaymentType();
}

// ── ABSTRACT CLASS — partial abstraction ──────────────────────────
// Has both abstract methods (no body) + concrete methods (with body)
abstract class Payment implements Payable {
    protected String customerName;
    protected double totalAmount;

    Payment(String customerName, double totalAmount) {
        this.customerName = customerName;
        this.totalAmount = totalAmount;
    }

    // Abstract — every payment type MUST define this differently
    public abstract void processPayment(double amount);
    public abstract String getPaymentType();

    // Concrete — same for ALL payment types (no need to rewrite)
    public void printReceipt() {
        System.out.println("──────────────────────────");
        System.out.println("Customer : " + customerName);
        System.out.println("Amount   : ₹" + totalAmount);
        System.out.println("Method   : " + getPaymentType());
        System.out.println("Status   : Payment Successful ✅");
        System.out.println("──────────────────────────");
    }
}

// ── CONCRETE CLASS 1 — Credit Card ────────────────────────────────
class CreditCardPayment extends Payment {
    private String cardNumber;

    CreditCardPayment(String customerName, double amount, String cardNumber) {
        super(customerName, amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount) {
        // Only last 4 digits shown — encapsulation too!
        String masked = "**** **** **** " + cardNumber.substring(cardNumber.length() - 4);
        System.out.println("Processing credit card: " + masked);
    }

    @Override
    public String getPaymentType() { return "Credit Card"; }
}

// ── CONCRETE CLASS 2 — UPI ────────────────────────────────────────
class UPIPayment extends Payment {
    private String upiId;

    UPIPayment(String customerName, double amount, String upiId) {
        super(customerName, amount);
        this.upiId = upiId;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Sending ₹" + amount + " via UPI to: " + upiId);
    }

    @Override
    public String getPaymentType() { return "UPI"; }
}

// ── CONCRETE CLASS 3 — Net Banking ───────────────────────────────
class NetBankingPayment extends Payment {
    private String bankName;

    NetBankingPayment(String customerName, double amount, String bankName) {
        super(customerName, amount);
        this.bankName = bankName;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Redirecting to " + bankName + " net banking portal...");
    }

    @Override
    public String getPaymentType() { return "Net Banking (" + bankName + ")"; }
}

// ── MAIN CLASS ────────────────────────────────────────────────────
public class Abstraction1 {
    public static void main(String[] args) {

        // Polymorphism + Abstraction together — Payment reference, different objects
        Payment[] payments = {
                new CreditCardPayment("Alice", 2999.00, "4111111111111234"),
                new UPIPayment("Bob", 599.00, "bob@okicici"),
                new NetBankingPayment("Charlie", 4500.00, "HDFC")
        };

        // Caller doesn't know HOW each payment works — just calls processPayment()
        // That's abstraction — hide the HOW, expose the WHAT
        for (Payment p : payments) {
            p.processPayment(p.totalAmount); // each behaves differently
            p.printReceipt();               // shared behavior from abstract class
            System.out.println();
        }

        // ❌ This is NOT allowed:
        // Payment p = new Payment("X", 100); // Cannot instantiate abstract class!
    }
}
