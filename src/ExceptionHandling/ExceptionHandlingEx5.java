package ExceptionHandling;

public class ExceptionHandlingEx5 {

    // Step 1 — Create your own exception class
    static class InsufficientBalanceException extends Exception {
        private double amount;

        public InsufficientBalanceException(double amount) {
            super("Insufficient balance! Tried to withdraw: ₹" + amount);
            this.amount = amount;
        }

        public double getAmount() {
            return amount;
        }
    }

    // Step 2 — Use it in your class
    static class BankAccount {
        private String owner;
        private double balance;

        BankAccount(String owner, double balance) {
            this.owner = owner;
            this.balance = balance;
        }

        // throws tells caller this method may throw our custom exception
        public void withdraw(double amount) throws InsufficientBalanceException {
            if (amount > balance) {
                throw new InsufficientBalanceException(amount); // manually throw
            }
            balance -= amount;
            System.out.println("Withdrawn ₹" + amount + " | Remaining: ₹" + balance);
        }

        public double getBalance() {
            return balance;
        }
    }

    // Step 3 — main directly here (removed inner CustomException class)
    public static void main(String[] args) {

        BankAccount acc = new BankAccount("Alice", 5000);

        // Test 1 — valid withdrawal
        try {
            acc.withdraw(2000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Test 2 — invalid withdrawal
        try {
            acc.withdraw(9000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Amount tried: ₹" + e.getAmount());
        } finally {
            System.out.println("Current balance: ₹" + acc.getBalance());
        }
    }
}