package StringManipulations;

public class StringManipulationEx2 {

        public static void main(String[] args) {

            String a = "hello";
            String b = "hello";
            String c = new String("hello"); // forces new object in heap

            // == compares memory address (reference)
            System.out.println(a == b);         // true  (both point to String Pool)
            System.out.println(a == c);         // false (c is new object in heap)

            // equals() compares actual content ✅ always use this
            System.out.println(a.equals(b));    // true
            System.out.println(a.equals(c));    // true

            // equalsIgnoreCase — ignores UPPER/lower
            String s1 = "JAVA";
            String s2 = "java";
            System.out.println(s1.equals(s2));            // false
            System.out.println(s1.equalsIgnoreCase(s2));  // true ✅

            // compareTo — checks alphabetical order
            System.out.println("apple".compareTo("banana")); // negative (apple comes first)
            System.out.println("mango".compareTo("mango"));  // 0 (equal)
            System.out.println("zebra".compareTo("apple"));  // positive (zebra comes after)
        }
    }

