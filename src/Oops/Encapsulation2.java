package Oops;

class BankAccount {

    // Private — no one can touch this directly
    private double balance;

    // Setter — deposit money (with validation)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid amount!");
        }
    }

    // Setter — withdraw money (with validation)
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Getter — read balance
    public double getBalance() {
        return balance;
    }
}

public class Encapsulation2 {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        acc.deposit(1000);
        acc.deposit(500);
        acc.withdraw(200);
        acc.withdraw(5000);   // will fail — insufficient

        System.out.println("Final Balance: " + acc.getBalance());

        // acc.balance = 999999; // ❌ Compile error — private!
    }
}