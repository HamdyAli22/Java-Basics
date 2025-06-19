import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // Create a Map with String keys and Integer values
        Map<String, Integer> map = new HashMap<>();

        // Add elements to the map
        map.put("John", 25);
        map.put("Jane", 20);
        map.put("Jack", 30);
        map.put("Bob", 40);

        // Access a value by key
        System.out.println("John's age: " + map.get("John"));

        // Check if a key exists
        if (map.containsKey("Bob")) {
            System.out.println("Bob is in the map.");
        }

        // Check if a value exists
        if (map.containsValue(40)) {
            System.out.println("Age 40 is in the map.");
        }

        // Remove an element
        map.remove("Jack");

        // Iterate through the map
        System.out.println("Map entries after removing Jack:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // Print size of map
        System.out.println("Size of map: " + map.size());
    }
}
