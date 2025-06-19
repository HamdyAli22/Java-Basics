import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Create a stack with a capacity of 4
        Stack<String> stack = new Stack<String>();

        // Push elements to the stack
        stack.push("John");
        stack.push("Jane");
        stack.push("Jack");
        stack.push("Bob");

        System.out.println("Original Stack" + stack);

        // Peek the top element
        System.out.println("Top element is: " + stack.peek());

        // Pop elements from the stack
        stack.pop();  // Output: John popped from stack
        stack.pop();  // Output: Jane popped from stack
        System.out.println("Stack After pop Jack, Bob " + stack);

        // Check the size of the stack
        System.out.println("Current stack size: " + stack.size());

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
