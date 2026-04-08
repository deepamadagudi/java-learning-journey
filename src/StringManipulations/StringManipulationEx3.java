package StringManipulations;

public class StringManipulationEx3 {

        public static void main(String[] args) {

            // split() — break string into array
            String fruits = "Apple,Banana,Mango,Orange";
            String[] arr = fruits.split(",");

            System.out.println("Total fruits: " + arr.length); // 4
            for (String fruit : arr) {
                System.out.println("  - " + fruit);
            }

            // Real world — parse a CSV row
            String csvRow = "101,Alice,Bengaluru,90000";
            String[] data = csvRow.split(",");
            System.out.println("\nID     : " + data[0]);
            System.out.println("Name   : " + data[1]);
            System.out.println("City   : " + data[2]);
            System.out.println("Salary : " + data[3]);

            // join() — opposite of split
            String joined = String.join(" | ", "Java", "Python", "SQL");
            System.out.println("\nJoined : " + joined); // Java | Python | SQL

            // join array back
            String rejoined = String.join(", ", arr);
            System.out.println("Rejoined: " + rejoined); // Apple, Banana, Mango, Orange
        }
    }
