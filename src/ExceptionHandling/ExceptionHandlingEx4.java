package ExceptionHandling;

public class ExceptionHandlingEx4 {
          // ThrowExample

        // Manually throw exception if rule is broken
        public static void validateAge(int age) {
            if (age < 18) {
                throw new IllegalArgumentException("Age must be 18+. You entered: " + age);
            }
            System.out.println("Age is valid. Welcome!");
        }

        public static void validateSalary(double salary) {
            if (salary < 0) {
                throw new ArithmeticException("Salary cannot be negative!");
            }
            System.out.println("Salary set to: " + salary);
        }

        public static void main(String[] args) {

            // Test 1 — valid age
            try {
                validateAge(25);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }

            // Test 2 — invalid age
            try {
                validateAge(15);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }

            // Test 3 — invalid salary
            try {
                validateSalary(-5000);
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
