import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Create a queue using LinkedList (LinkedList implements Queue)
        Queue<String> queue = new LinkedList<>();

        // Enqueue elements using offer() method
        queue.offer("John");
        queue.offer("Jane");
        queue.offer("Jack");
        queue.offer("Bob");

        System.out.println("Original Queue" + queue);

        // Peek the front element of the queue using peek() method
        System.out.println("Front element is: " + queue.peek());  // Output: Front element is: John

        // Dequeue elements using poll() method (removes from the front)
        queue.poll();  // Output: Dequeued: John
        queue.poll();  // Output: Dequeued: Jane
        System.out.println("Queue After poll John, Jane " + queue);

        // Check the size of the queue
        System.out.println("Queue size: " + queue.size());  // Output: Queue size: 1

        // Check if the queue is empty using isEmpty()
        System.out.println("Is queue empty? " + queue.isEmpty());




    }
}
