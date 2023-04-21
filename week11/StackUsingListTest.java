package week11;

public class StackUsingListTest {
    public static void main(String[] args) {
        StackUsingList stack = new StackUsingList();

        stack.push("Apple");
        stack.push("Banana");
        stack.push("Carrot");

        System.out.print("\nCurrent Stack:");
        System.out.println(stack);

        String poppedItem = stack.pop();
        System.out.println("\nPopped Item: " + poppedItem);

        System.out.print("\nCurrent Stack: ");
        System.out.println(stack);
        System.out.println();

        while(stack.top > 0) {
            poppedItem = stack.pop();
            System.out.println("Popped Item: " + poppedItem);
        }

        try {
            stack.pop();
        } catch (IllegalStateException e) {
            System.out.println("\nTried to pop an item off an empty stack and got exception: " + e.getMessage());
        }
    }
}
