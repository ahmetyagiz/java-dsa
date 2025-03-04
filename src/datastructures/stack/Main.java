package datastructures.stack;

public class Main {

    public static void main(String[] args) {

        Stack myStack = new Stack(4);

        myStack.getTop();
        myStack.getHeight();

        System.out.println("\nStack:");
        myStack.printStack();

        /*
            EXPECTED OUTPUT:
            ----------------
            Top: 4
            Height: 1

            Stack:
            4

        */

    }

}