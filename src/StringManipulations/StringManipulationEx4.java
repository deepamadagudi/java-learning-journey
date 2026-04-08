package StringManipulations;

public class StringManipulationEx4 {

        public static void main(String[] args) {

            // ❌ BAD — String concatenation in loop (creates new object every time!)
            String result = "";
            for (int i = 1; i <= 5; i++) {
                result += i + " ";  // slow — 5 new String objects created!
            }
            System.out.println("String    : " + result);

            // ✅ GOOD — StringBuilder (modifies same object — fast!)
            StringBuilder sb = new StringBuilder();

            sb.append("Hello");         // add to end
            sb.append(" ");
            sb.append("Java");
            sb.insert(5, ",");          // insert at position
            sb.replace(7, 11, "World"); // replace portion
            sb.reverse();               // reverse entire string

            System.out.println("Builder   : " + sb.toString());

            // StringBuilder in loop — correct way
            StringBuilder numbers = new StringBuilder();
            for (int i = 1; i <= 5; i++) {
                numbers.append(i).append(" "); // chaining ✅
            }
            System.out.println("Numbers   : " + numbers.toString().trim());

            // Useful methods
            StringBuilder s = new StringBuilder("Hello Java");
            System.out.println("Length    : " + s.length());       // 10
            System.out.println("charAt(6) : " + s.charAt(6));      // J
            s.delete(5, 10);
            System.out.println("After del : " + s.toString());     // Hello
        }
    }

