package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> students = new ArrayList<>();

        // add() — add elements
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");
        students.add("Bob");      // duplicates allowed ✅
        students.add("Diana");

        System.out.println("List     : " + students);
        System.out.println("Size     : " + students.size());
        System.out.println("Get(1)   : " + students.get(1));       // Bob
        System.out.println("Index Bob: " + students.indexOf("Bob")); // 1

        // update
        students.set(1, "Betty");
        System.out.println("After set: " + students);

        // remove
        students.remove("Charlie");          // by value
        students.remove(0);                  // by index
        System.out.println("After rem: " + students);

        // check
        System.out.println("Has Diana: " + students.contains("Diana")); // true
        System.out.println("Empty?   : " + students.isEmpty());         // false

        // sort
        Collections.sort(students);
        System.out.println("Sorted   : " + students);

        // loop
        System.out.println("-- Loop --");
        for (String s : students) {
            System.out.println("  " + s);
        }
    }
}