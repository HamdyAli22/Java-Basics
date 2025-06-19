import java.util.*;
public class ListSetComparison {
    public static void main(String[] args) {
        // 1. Order of Elements
        System.out.println("---- Order of Elements ----");
        List<String> list = new ArrayList<>();
        list.add("John");
        list.add("Jane");
        list.add("Jack");
        list.add("Bob");
        System.out.println("List (ArrayList) Order: " + list);

        Set<String> set = new HashSet<>();
        set.add("John");
        set.add("Jane");
        set.add("Jack");
        set.add("Bob");
        System.out.println("Set (HashSet) Order: " + set);

        // 2. Duplicates
        System.out.println("\n---- Duplicates ----");
        list.add("John");  // List allows duplicates
        System.out.println("List after adding duplicate 'John': " + list);

        set.add("John");  // Set does not allow duplicates
        System.out.println("Set after adding duplicate 'John': " + set);

        // 3. Implementation Classes
        System.out.println("\n---- Implementation Classes ----");
        List<String> linkedList = new LinkedList<>();
        linkedList.add("John");
        linkedList.add("Jane");
        linkedList.add("Jack");
        linkedList.add("Bob");
        System.out.println("LinkedList (List Implementation): " + linkedList);

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("John");
        treeSet.add("Jane");
        treeSet.add("Jack");
        treeSet.add("Bob");
        System.out.println("TreeSet (Set Implementation): " + treeSet);

        // 4. Indexing
        System.out.println("\n---- Indexing ----");
        System.out.println("List (ArrayList) Access by Index: " + list.get(0));  // Access by index
        // Set does not support indexing, so we can't do something like set.get(0)
        System.out.println("Set does not support indexing.You must iterate through the Set to access elements");
        System.out.println("Iterating over the Set:");
        for (String element : set) {
            System.out.println(element);
        }

        // 5. Use Cases
        System.out.println("\n---- Use Cases ----");
        System.out.println("Use a List when order matters and duplicates are allowed.");
        System.out.println("Use a Set when you need unique elements, and order is not important (unless using LinkedHashSet or TreeSet).");
    }
}

