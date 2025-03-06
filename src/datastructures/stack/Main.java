package datastructures.stack;

public class Main {

    public static void main(String[] args) {

        Stack myStack = new Stack(4);
        myStack.push(2);
        myStack.push(7);

        // (2) Items - Returns 1 Node
        System.out.println("Popped Item: " + myStack.pop().value);
        // (1) Item - Returns 2 Node
        System.out.println("Popped Item: " + myStack.pop().value);

        System.out.println("\nStack:");
        myStack.printStack();

        /*
            EXPECTED OUTPUT:
            ----------------
            Top:
            Height:

            Stack:


        */

    }

}