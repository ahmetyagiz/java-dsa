package datastructures.linkedlist;

public class Main {

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(4);
        myLinkedList.makeEmpty();
        myLinkedList.append(1);
        myLinkedList.append(2);

        // (2) Items - Returns 2 Node
        System.out.println(myLinkedList.removeLast().value);

        // (1) Items - Returns 1 Node
        System.out.println(myLinkedList.removeLast().value);

        // (0) Items - Returns null
        System.out.println(myLinkedList.removeLast());

        // Add value to start
        myLinkedList.prepend(7);

        myLinkedList.prepend(6);
        myLinkedList.append(8);
        myLinkedList.append(9);
        System.out.println(myLinkedList.removeFirst().value);
        System.out.println("Index 1 is: " + myLinkedList.get(1).value);
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.insert(1,12);
        myLinkedList.set(3,4);
        myLinkedList.remove(0);
        myLinkedList.reverse();
        System.out.println("\nLinked List:");
        myLinkedList.printList();

        /*
            EXPECTED OUTPUT:
            ----------------
            Head: 7
            Tail: 9
            Length: 3

            Linked List:
            4
            8
            12

        */

    }

}