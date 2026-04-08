package ExceptionHandling;

public class ExceptionHandlingEx2 {
              //MultipleCatch
        public static void main(String[] args) {

            // Try changing index and divisor to see different exceptions
            try {
                int[] numbers = {10, 20, 30};

                // Uncomment one at a time to test:
                int result = numbers[0] / 0;       // ArithmeticException
                // int result = numbers[10];        // ArrayIndexOutOfBoundsException
                // String s = null; s.length();     // NullPointerException
                // int x = Integer.parseInt("abc"); // NumberFormatException

                System.out.println("Result: " + result);

            } catch (ArithmeticException e) {
                System.out.println("Math error: " + e.getMessage());

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array error: " + e.getMessage());

            } catch (NullPointerException e) {
                System.out.println("Null error: something is null!");

            } catch (NumberFormatException e) {
                System.out.println("Format error: not a valid number!");

            } catch (Exception e) {
                // Generic catch — catches anything not caught above
                // Always put this LAST
                System.out.println("Unknown error: " + e.getMessage());

            } finally {
                System.out.println("Cleanup done.");
            }
        }
    }