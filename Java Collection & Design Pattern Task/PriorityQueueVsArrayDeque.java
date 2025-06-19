import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class PriorityQueueVsArrayDeque {
    public static void main(String[] args) {
        // 1. PriorityQueue Example (Ordered by priority)
        //System.out.println("PriorityQueue (Ordered by priority):");
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("John");
        priorityQueue.add("Jane");
        priorityQueue.add("Jack");
        priorityQueue.add("Bob");

        System.out.println("PriorityQueue elements (by priority):");
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());  // Polls the element with the highest priority
        }

        // 2. ArrayDeque Example (FIFO Order, operations on both ends)
        // System.out.println("\nArrayDeque (FIFO order, both ends accessible):");
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("John");
        arrayDeque.add("Jane");
        arrayDeque.add("Jack");
        arrayDeque.add("Bob");
        System.out.println("\nArrayDeque elements (FIFO order):");
        for (String element : arrayDeque) {
            System.out.println(element);
        }

        // Access the first and last elements
        System.out.println("\nFirst element: " + arrayDeque.peekFirst());  // "John"
        System.out.println("Last element: " + arrayDeque.peekLast());   // "Bob"

        // Remove from front and back
        System.out.println("\nRemove first element: " + arrayDeque.pollFirst());  // Removes "John"
        System.out.println("Remove last element: " + arrayDeque.pollLast());   // Removes "Bob"

        // Remaining elements in ArrayDeque
        System.out.println("\nRemaining elements in ArrayDeque (FIFO):");
        for (String element : arrayDeque) {
            System.out.println(element);
        }

        // 3. Duplicates: Both allow duplicates
        System.out.println("\nAllowing duplicates in both collections:");
        PriorityQueue<String> pqWithDuplicates = new PriorityQueue<>();
        pqWithDuplicates.add("John");
        pqWithDuplicates.add("Jane");
        pqWithDuplicates.add("Jack");
        pqWithDuplicates.add("Bob");
        pqWithDuplicates.add("Jack");  // Duplicate

        System.out.println("PriorityQueue with duplicates:");
        while (!pqWithDuplicates.isEmpty()) {
            System.out.println(pqWithDuplicates.poll());  // Duplicates will be present
        }

        ArrayDeque<String> dequeWithDuplicates = new ArrayDeque<>();
        dequeWithDuplicates.add("John");
        dequeWithDuplicates.add("Jane");
        dequeWithDuplicates.add("Jack");
        dequeWithDuplicates.add("Bob");
        dequeWithDuplicates.add("Jack");

        System.out.println("\nArrayDeque with duplicates:");
        for (String element : dequeWithDuplicates) {
            System.out.println(element);  // Duplicates will be present
        }

        // 4. Null elements: PriorityQueue doesn't allow null elements.
        try {
            PriorityQueue<String> nullTestPQ = new PriorityQueue<>();
            nullTestPQ.add(null);  // Will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("\nPriorityQueue does not allow null elements.");
        }

        // ArrayDeque allows null elements
        ArrayDeque<String> arrayDequeWithNull = new ArrayDeque<>();
        arrayDequeWithNull.add(null);  // Null element is allowed
        arrayDequeWithNull.add("John");
        System.out.println("\nArrayDeque with null element:");
        for (String element : arrayDequeWithNull) {
            System.out.println(element);  // Includes null
        }

        // 5. Capacity Management:
        // PriorityQueue doesn't manage capacity explicitly; it grows dynamically.
        // ArrayDeque grows automatically, starting from a default size (16) and doubling when needed.

        // Example of ArrayDeque's initial capacity and growth:
        System.out.println("\nArrayDeque initial capacity and growth:");
        ArrayDeque<String> dequeWithCapacity = new ArrayDeque<>(2);  // Initial capacity of 2
        dequeWithCapacity.add("John");
        dequeWithCapacity.add("Jane");
        dequeWithCapacity.add("Jack");  // Will cause resize

        System.out.println("Size after adding elements: " + dequeWithCapacity.size());

    }
}
