package datastructures.doublylinkedlist;

public class Main {

    public static void main(String[] args) {

        DoublyLinkedList myDLL = new DoublyLinkedList(7);

        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();

        myDLL.append(9);
        myDLL.prepend(4);
        myDLL.prepend(11);
        myDLL.removeLast();
        myDLL.removeFirst();
        int index = 1;
        System.out.println("Index " + index + " is: " + myDLL.get(index).value);
        myDLL.set(1, 9);
        myDLL.insert(1, 17);
        myDLL.remove(2);
        System.out.println("\nDoubly Linked List:");
        myDLL.printList();

        /*
            EXPECTED OUTPUT:
            ----------------
            Head: 7
            Tail: 7
            Length: 1

            Doubly Linked List:
            4
            7

        */

    }

}