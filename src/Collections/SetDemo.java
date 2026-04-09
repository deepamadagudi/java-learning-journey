package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {

        // HashSet — no guaranteed order
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Banana");
        hashSet.add("Apple");
        hashSet.add("Mango");
        hashSet.add("Apple"); // duplicate — ignored! ✅
        hashSet.add("Orange");
        System.out.println("HashSet       : " + hashSet); // random order

        // LinkedHashSet — maintains insertion order
        LinkedHashSet<String> linkedSet = new LinkedHashSet<>();
        linkedSet.add("Banana");
        linkedSet.add("Apple");
        linkedSet.add("Mango");
        linkedSet.add("Apple"); // duplicate — ignored!
        linkedSet.add("Orange");
        System.out.println("LinkedHashSet : " + linkedSet); // insertion order

        // TreeSet — always sorted
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Mango");
        treeSet.add("Apple"); // duplicate — ignored!
        treeSet.add("Orange");
        System.out.println("TreeSet       : " + treeSet); // A to Z

        // TreeSet extra methods
        System.out.println("First  : " + treeSet.first());       // Apple
        System.out.println("Last   : " + treeSet.last());        // Orange

        // Real world — remove duplicate votes
        System.out.println("\n-- Removing Duplicate Votes --");
        String[] votes = {"Alice","Bob","Alice","Charlie","Bob","Alice"};
        HashSet<String> uniqueVotes = new HashSet<>();
        for (String vote : votes) {
            uniqueVotes.add(vote);
        }
        System.out.println("Unique voters : " + uniqueVotes);
        System.out.println("Total unique  : " + uniqueVotes.size());
    }
}