
import java.util.Collection;
import java.util.Vector;

public class ListImplement {
    public static void main(String[] args) {
        // Create an ArrayList using the factory
        Collection<Object> arrayList = CollectionFactory.getCollection("java.util.ArrayList");
        arrayList.add("Item 1");
        arrayList.add("Item 2");
        System.out.println("ArrayList: " + arrayList);

        // Create a LinkedList using the factory
        Collection<Object> linkedList = CollectionFactory.getCollection("java.util.LinkedList");
        linkedList.add("Item A");
        linkedList.add("Item B");
        System.out.println("LinkedList: " + linkedList);

        // Create a Vector using the factory
        Collection<Object> vector = CollectionFactory.getCollection("java.util.Vector");
        vector.add("Item X");
        vector.add("Item Y");
        System.out.println("Vector: " + vector);

        // Create a Stack using the factory
        Collection<Object> stack = CollectionFactory.getCollection("java.util.Stack");
        stack.add("Item 10");
        stack.add("Item 20");
        System.out.println("Stack: " + stack);

    }
}
