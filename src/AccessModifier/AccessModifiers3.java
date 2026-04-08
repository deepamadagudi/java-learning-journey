package AccessModifier;

class BankAccount {

    public    String bankName   = "SBI";         // everyone can see
    protected String holderName = "Alice";        // subclass + same package
    String branch     = "Bengaluru";    // default — same package only
    private   double balance    = 50000;          // only this class

    public void showPublicInfo() {
        System.out.println("Bank    : " + bankName);    // ✅
        System.out.println("Holder  : " + holderName);  // ✅
        System.out.println("Branch  : " + branch);      // ✅
        System.out.println("Balance : " + balance);     // ✅ inside same class
    }
}

class SavingsAccount extends BankAccount {

    public void showSavingsInfo() {
        System.out.println("Bank   : " + bankName);     // ✅ public
        System.out.println("Holder : " + holderName);   // ✅ protected
        System.out.println("Branch : " + branch);       // ✅ default — same package

        // ❌ private — not accessible in subclass
        // System.out.println(balance);
    }
}

public class AccessModifiers3 {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount();
        System.out.println("=== BankAccount ===");
        acc.showPublicInfo();

        System.out.println("\n=== SavingsAccount ===");
        SavingsAccount sav = new SavingsAccount();
        sav.showSavingsInfo();

        // Direct field access from main (same package)
        System.out.println("\n=== Direct Access from Main ===");
        System.out.println(acc.bankName);    // ✅ public
        System.out.println(acc.holderName);  // ✅ protected — same package
        System.out.println(acc.branch);      // ✅ default  — same package

        // ❌ private — error from anywhere outside class
        // System.out.println(acc.balance);
    }
}
