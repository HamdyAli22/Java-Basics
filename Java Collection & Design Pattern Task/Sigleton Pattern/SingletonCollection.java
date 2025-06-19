import java.util.ArrayList;
import java.util.List;

public class SingletonCollection {
    // Step 1: Private static instance of the collection
    private static List<String> uniqueList;

    // Step 2: Private constructor to prevent instantiation from other classes
    private SingletonCollection() {
        uniqueList = new ArrayList<>();
    }

    // Step 3: Public static method to get the instance of the collection
    public static List<String> getInstance() {
        if (uniqueList == null) {
            // Lazy initialization of the collection
            uniqueList = new ArrayList<>();
        }
        return uniqueList;
    }

    // Additional method to add elements to the collection
    public static void addItem(String item) {
        getInstance().add(item);
    }

    // Additional method to get the collection size
    public static int getSize() {
        return getInstance().size();
    }
}
