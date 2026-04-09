package Collections;

import java.util.*;

public class StudentResultSystem {
    public static void main(String[] args) {

        // Store student marks — name → list of marks
        HashMap<String, ArrayList<Integer>> results = new HashMap<>();

        results.put("Alice",   new ArrayList<>(Arrays.asList(85, 90, 92, 88)));
        results.put("Bob",     new ArrayList<>(Arrays.asList(70, 65, 80, 75)));
        results.put("Charlie", new ArrayList<>(Arrays.asList(95, 98, 92, 97)));

        System.out.println("===== Student Result System =====");

        for (Map.Entry<String, ArrayList<Integer>> entry : results.entrySet()) {
            String name = entry.getKey();
            ArrayList<Integer> marks = entry.getValue();

            // Calculate average
            int sum = 0;
            for (int mark : marks) sum += mark;
            double avg = (double) sum / marks.size();

            // Grade logic
            String grade;
            if      (avg >= 90) grade = "A";
            else if (avg >= 75) grade = "B";
            else                grade = "C";

            System.out.println(name + " → Avg: " + avg + " | Grade: " + grade);
        }

        // Find unique subjects using Set
        System.out.println("\n-- Unique Grades Given --");
        Set<String> uniqueGrades = new HashSet<>(Arrays.asList("A","B","A","C","B","A"));
        System.out.println("Grades : " + uniqueGrades);

        // Sorted leaderboard using TreeMap
        System.out.println("\n-- Leaderboard (sorted by name) --");
        TreeMap<String, Double> leaderboard = new TreeMap<>();
        leaderboard.put("Alice",   88.75);
        leaderboard.put("Charlie", 95.5);
        leaderboard.put("Bob",     72.5);
        for (Map.Entry<String, Double> e : leaderboard.entrySet()) {
            System.out.println("  " + e.getKey() + " : " + e.getValue());
        }
    }
}