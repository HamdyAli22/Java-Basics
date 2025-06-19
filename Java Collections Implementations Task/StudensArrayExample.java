import java.util.Arrays;

public class StudensArrayExample {
    public static void main(String[] args) {

        //Declare an Array
        String[] names;

        //Allocate Memory for the Array
        names = new String[4];

        //Initialize the Array
        names[0] = "John";
        names[1] = "Jane";
        names[2] = "Jack";
        names[3] = "Bob";

        //Access Array Elements
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("Original Array: " + Arrays.toString(names));

        //Adding element to array
        // New element to add
        String newElement = "samual";
        // Create a new array with size 1 more than the original array
        String[] newArray = new String[names.length + 1];
        //Copy the original array's elements into the new array
        for (int i = 0; i < names.length; i++) {
            newArray[i] = names[i];
        }
        // Step 3: Add the new element at the last position
        newArray[names.length] = newElement;
        System.out.println("New Array After Adding Samual: " + Arrays.toString(newArray));

        //Removing element from original array
        int indexToRemove = 2;
        //Create a new array with one less size
        newArray = new String[names.length - 1];
        // Copy elements before the index to remove
        for (int i = 0, j = 0; i < names.length; i++) {
            if (i == indexToRemove) {
                continue;  // Skip the element to be removed
            }
            newArray[j++] = names[i];
        }
        System.out.println("New Array After Removing Jack: " + Arrays.toString(newArray));

        //Updating an Element in array
        names[1] = "Peter";
        System.out.println("New Array After updating Jane with Peter: " + Arrays.toString(names));

        //Search for element in array
        String targetElement = "Bob";
        //Loop through the array to find the target element
        int index = searchElement(names, targetElement);
        if (index != -1) {
            System.out.println("Element " + targetElement + " found at index: " + index);
        } else {
            System.out.println("Element " + targetElement + " not found in the array.");
        }

    }
    public static int searchElement(String[] array, String target) {
        //Loop through the array to find the target element
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Return the index if found
            }
        }
        return -1; // Return -1 if element not found
    }
}
