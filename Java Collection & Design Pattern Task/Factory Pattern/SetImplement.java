import java.util.Collection;

public class SetImplement {
    public static void main(String[] args) {
        // Create a HashSet using the factory
        Collection<Object> hashSet = CollectionFactory.getCollection("java.util.HashSet");
        hashSet.add("Item 1");
        hashSet.add("Item 2");
        System.out.println("HashSet: " + hashSet);

        // Create a LinkedHashSet using the factory
        Collection<Object> linkedHashSet = CollectionFactory.getCollection("java.util.LinkedHashSet");
        linkedHashSet.add("Item A");
        linkedHashSet.add("Item B");
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // Create a TreeSet using the factory
        Collection<Object> treeSet = CollectionFactory.getCollection("java.util.TreeSet");
        treeSet.add("Item X");
        treeSet.add("Item Y");
        System.out.println("TreeSet: " + treeSet);
    }
}
