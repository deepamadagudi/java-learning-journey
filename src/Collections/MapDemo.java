package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {

        // HashMap — key-value, no order
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 95);
        scores.put("Bob", 87);
        scores.put("Charlie", 92);
        scores.put("Alice", 99); // duplicate key — overwrites! ✅
        System.out.println("HashMap  : " + scores);

        // get value by key
        System.out.println("Alice    : " + scores.get("Alice")); // 99

        // check key/value exists
        System.out.println("Has Bob  : " + scores.containsKey("Bob"));    // true
        System.out.println("Has 100  : " + scores.containsValue(100));    // false

        // remove
        scores.remove("Bob");
        System.out.println("After rem: " + scores);

        // Loop through map
        System.out.println("-- All Scores --");
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println("  " + entry.getKey() + " → " + entry.getValue());
        }

        // LinkedHashMap — maintains insertion order
        System.out.println("\n-- LinkedHashMap --");
        LinkedHashMap<String, String> menu = new LinkedHashMap<>();
        menu.put("Starter", "Soup");
        menu.put("Main",    "Biryani");
        menu.put("Dessert", "Gulab Jamun");
        menu.put("Drink",   "Lassi");
        for (Map.Entry<String, String> item : menu.entrySet()) {
            System.out.println("  " + item.getKey() + " : " + item.getValue());
        }

        // TreeMap — sorted by key A-Z
        System.out.println("\n-- TreeMap (sorted) --");
        TreeMap<String, Integer> cityPop = new TreeMap<>();
        cityPop.put("Mumbai",    20000000);
        cityPop.put("Bengaluru", 12000000);
        cityPop.put("Delhi",     30000000);
        cityPop.put("Chennai",   10000000);
        for (Map.Entry<String, Integer> city : cityPop.entrySet()) {
            System.out.println("  " + city.getKey() + " : " + city.getValue());
        }
        System.out.println("First city: " + cityPop.firstKey()); // Bengaluru
        System.out.println("Last city : " + cityPop.lastKey());  // Mumbai
    }
}