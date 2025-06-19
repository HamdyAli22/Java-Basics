import java.util.Collection;

public class QueueImplement {
    public static void main(String[] args) {
        // Create a PriorityQueue using the factory
        Collection<Object> priorityQueue = CollectionFactory.getCollection("java.util.PriorityQueue");
        priorityQueue.add("Item 1");
        priorityQueue.add("Item 2");
        System.out.println("PriorityQueue: " + priorityQueue);

        // Create an ArrayDeque using the factory
        Collection<Object> arrayDeque = CollectionFactory.getCollection("java.util.ArrayDeque");
        arrayDeque.add("Item A");
        arrayDeque.add("Item B");
        System.out.println("ArrayDeque: " + arrayDeque);

    }
}
