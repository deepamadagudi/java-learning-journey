package ExceptionHandling;

public class ExceptionHandlingEx1 {

        public static void main(String[] args) {

            System.out.println("Program starts...");

            try {
                // Code that might throw exception
                int a = 10;
                int b = 0;
                int result = a / b;  // ❌ ArithmeticException thrown here!
                System.out.println("Result: " + result); // never reaches here

            } catch (ArithmeticException e) {
                // Handle the exception
                System.out.println("Caught! Cannot divide by zero.");
                System.out.println("Error msg: " + e.getMessage()); // / by zero
            } finally {
                // Always runs — use for cleanup
                System.out.println("Finally block — always executes!");
            }

            System.out.println("Program continues normally...");
        }
    }
