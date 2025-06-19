public class Main {
    public static void main(String[] args) {

        // Adding items to the Singleton List
        SingletonCollection.addItem("Jack");
        SingletonCollection.addItem("Bob");

        // Accessing the Singleton List
        System.out.println("Size of collection: " + SingletonCollection.getSize());  // Output: 2
        System.out.println("Items in collection: " + SingletonCollection.getInstance());  // Output: [Jack, Bob]

        // Trying to get the collection from another place (still the same instance)
        SingletonCollection.addItem("Jane");

        System.out.println("Updated Items in collection: " + SingletonCollection.getInstance());  // Output: [Jack, Bob, Jane]

    }
}