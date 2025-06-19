import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetVsLinkedHashSet {
    public static void main(String[] args) {
        // 1. Order of Elements: HashSet does not guarantee order, LinkedHashSet maintains insertion order.
        System.out.println("---- Order of Elements ----");
        // HashSet Example (No Order Guarantee)
        Set<String> hashSet = new HashSet<>();
        hashSet.add("John");
        hashSet.add("Jane");
        hashSet.add("Jack");
        hashSet.add("Bob");
        System.out.println("HashSet (No order guarantee):");
        for (String element : hashSet) {
            System.out.println(element);
        }
        // LinkedHashSet Example (Maintains Insertion Order)
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("John");
        linkedHashSet.add("Jane");
        linkedHashSet.add("Jack");
        linkedHashSet.add("Bob");
        System.out.println("LinkedHashSet (Maintains Insertion Order):");
        for (String element : linkedHashSet) {
            System.out.println(element);
        }

        System.out.println("\n---- Duplicates ----");
        // 2. Duplicates: Both HashSet and LinkedHashSet do not allow duplicates
        hashSet.add("John");  // Adding duplicate "John"
        System.out.println("HashSet after adding duplicate 'John': " + hashSet); // Duplicates are not added

        linkedHashSet.add("John");  // Adding duplicate "John"
        System.out.println("linkedHashSet after adding duplicate 'John': " + linkedHashSet); // Duplicates are not added

        System.out.println("\n---- Memory overhead ----");
        // 3. Memory Overhead: LinkedHashSet has a higher memory overhead
        System.out.println("Memory overhead: LinkedHashSet requires more memory due to maintaining insertion order.");
    }
}
