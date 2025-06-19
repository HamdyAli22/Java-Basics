import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        // Add elements to the LinkedList
        list.add("John");
        list.add("Jane");
        list.add("Jack");
        list.add("Bob");

        System.out.println("Original List: " + list);

        // Add elements at the beginning of the list
        list.addFirst("Peter");

        // Add elements at the end of the list
        list.addLast("Charlie");

        System.out.println("List after adding peter at first and charlie at end: " + list);

        //Remove element from the list
        list.remove(1);
        System.out.println("List after removing John: " + list);

        //Remove the first and last elements
        list.removeFirst();  // Removes John (first element)
        list.removeLast();   // Removes Charlie (last element)
        System.out.println("List after removing first and last elements: " + list);

        // Get the first and last elements without removing
        String firstElement = list.getFirst();  // Returns the first element (John)
        String lastElement = list.getLast();    // Returns the last element (Bob)
        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);


        // Check if a specific element exists
        String targetElement = "Bob";
        if(list.contains(targetElement)) {
            System.out.println("Element " + targetElement + " found at index: " + list.indexOf(targetElement));
        }else{
            System.out.println("Element " + targetElement + " not found");
        }

        // Get the size of the list
        int size = list.size();
        System.out.println("Size of the LinkedList: " + size);
    }
}
