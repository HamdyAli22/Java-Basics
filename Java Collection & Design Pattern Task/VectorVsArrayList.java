import java.util.ArrayList;
import java.util.Vector;

public class VectorVsArrayList {
    public static void main(String[] args) {
        // 1. Vector Example (Thread-safe, slower due to synchronization)
        Vector<String> vector = new Vector<>();
        vector.add("John");
        vector.add("Jane");
        vector.add("Jack");
        vector.add("Bob");

        System.out.println("Vector Elements:");
        for (String element : vector) {
            System.out.println(element);
        }

        // 2. ArrayList Example (Not thread-safe, faster)
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("John");
        arrayList.add("Jane");
        arrayList.add("Jack");
        arrayList.add("Bob");

        System.out.println("\nArrayList Elements:");
        for (String element : arrayList) {
            System.out.println(element);
        }

        // 3. Capacity Growth Behavior Comparison

        Vector<String> vectorWithInitialCapacity = new Vector<>(2);
        vectorWithInitialCapacity.add("John");
        vectorWithInitialCapacity.add("Jane");
        vectorWithInitialCapacity.add("Jack"); // Will cause resize

        System.out.println("\nVector with Initial Capacity of 2 after resize:");
        System.out.println("Size: " + vectorWithInitialCapacity.size());
        System.out.println("Capacity: " + vectorWithInitialCapacity.capacity());

        // ArrayList with initial capacity of 2 (will grow by 50% when exceeded)
        ArrayList<String> arrayListWithInitialCapacity = new ArrayList<>(2);
        arrayListWithInitialCapacity.add("John");
        arrayListWithInitialCapacity.add("Jane");
        arrayListWithInitialCapacity.add("Jack"); // Will cause resize

        System.out.println("\nArrayList with Initial Capacity of 2 after resize:");
        System.out.println("Size: " + arrayListWithInitialCapacity.size());
        System.out.println("Capacity: " + arrayListWithInitialCapacity.size());
    }
}
