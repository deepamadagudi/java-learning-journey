package StringManipulations;

public class StringManipulationsex1 {

        public static void main(String[] args) {

            String name = "  Hello Java  ";

            // Length
            System.out.println("Length     : " + name.length());        // 14

            // Trim spaces
            String trimmed = name.trim();
            System.out.println("Trimmed    : " + trimmed);              // Hello Java

            // Upper and Lower case
            System.out.println("Upper      : " + trimmed.toUpperCase()); // HELLO JAVA
            System.out.println("Lower      : " + trimmed.toLowerCase()); // hello java

            // charAt — get character at position
            System.out.println("charAt(6)  : " + trimmed.charAt(6));    // J

            // indexOf — find where a character is
            System.out.println("indexOf(J) : " + trimmed.indexOf('J')); // 6

            // substring — cut a portion
            System.out.println("substring  : " + trimmed.substring(6)); // Java
            System.out.println("substring  : " + trimmed.substring(0,5));// Hello

            // replace
            System.out.println("replace    : " + trimmed.replace("Java", "World")); // Hello World

            // contains
            System.out.println("contains   : " + trimmed.contains("Java")); // true
        }
    }

