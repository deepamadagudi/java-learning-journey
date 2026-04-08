package StringManipulations;

public class StringManipulationEx5 {

        public static void main(String[] args) {

            // Simulate user inputs
            String username = "  Alice123  ";
            String email    = "ALICE@GMAIL.COM";
            String phone    = "9876543210";
            String password = "pass";

            System.out.println("===== Form Validation =====");

            // 1. Clean username
            String cleanName = username.trim();
            System.out.println("Username  : " + cleanName); // Alice123

            // 2. Normalize email to lowercase
            String cleanEmail = email.trim().toLowerCase();
            System.out.println("Email     : " + cleanEmail); // alice@gmail.com

            // 3. Validate email format
            if (cleanEmail.contains("@") && cleanEmail.endsWith(".com")) {
                System.out.println("Email     : Valid ✅");
            } else {
                System.out.println("Email     : Invalid ❌");
            }

            // 4. Validate phone — must be 10 digits
            if (phone.length() == 10) {
                System.out.println("Phone     : Valid ✅");
            } else {
                System.out.println("Phone     : Invalid ❌");
            }

            // 5. Validate password — min 8 chars
            if (password.length() >= 8) {
                System.out.println("Password  : Strong ✅");
            } else {
                System.out.println("Password  : Too short ❌ (min 8 chars)");
            }

            // 6. Mask phone number
            String masked = phone.substring(0, 6) + "XXXX";
            System.out.println("Masked Ph : " + masked); // 987654XXXX

            // 7. Generate display name from email
            String displayName = cleanEmail.substring(0, cleanEmail.indexOf("@"));
            System.out.println("Display   : " + displayName); // alice
        }
    }
