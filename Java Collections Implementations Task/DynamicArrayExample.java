import java.util.ArrayList;
import java.util.Arrays;

public class DynamicArrayExample {
    public static void main(String[] args) {
        //Create a dynamic array using ArrayList
        ArrayList<String> dynamicArray = new ArrayList<>();

        //Add elements to the dynamic array
        dynamicArray.add("John");
        dynamicArray.add("Jane");
        dynamicArray.add("Jack");
        dynamicArray.add("Bob");

        //Access Array Element
        for (String element : dynamicArray) {
            System.out.println(element);
        }

        System.out.println("Original Array: " +dynamicArray);

        //Remove an element (remove element at index 1)
        dynamicArray.remove(1);
        System.out.println("New Array After Removing Jane: " + dynamicArray);

        //Update the element at the specified index using set()
        dynamicArray.set(1, "Peter");
        System.out.println("New Array After updating Jane with Peter: " + dynamicArray);

        //Search for element in array
        String targetElement = "Bob";
        if (dynamicArray.contains(targetElement)) {
            System.out.println("Element " + targetElement + " found at index: " + dynamicArray.indexOf(targetElement));
        } else {
            System.out.println("Element " + targetElement + " not found in the array.");
        }
    }
}
