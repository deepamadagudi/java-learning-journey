public class DataTypesExample {

    public static void main(String[] args) {

        // ===== Day 1: Data Types =====
        // Primitive Data Types

        int age = 25;
        double salary = 25000.50;
        char grade = 'A';
        boolean isJavaFun = true;

        // Non-Primitive
        String name = "Deepa";

        // Output
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Grade: " + grade);
        System.out.println("Is Java Fun: " + isJavaFun);

        // ===== Type Conversion =====

        // Implicit Casting (Widening)
        int num = 10;
        double convertedNum = num; // int → double (automatic)

        System.out.println("Implicit Casting (int to double): " + convertedNum);

        // Explicit Casting (Narrowing)
        double price = 99.99;
        int finalPrice = (int) price; // double → int (manual)

        System.out.println("Explicit Casting (double to int): " + finalPrice);
    }
}