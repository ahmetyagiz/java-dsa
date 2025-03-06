package datastructures.queue;

public class Main {

    public static void main(String[] args) {

        Queue myQueue = new Queue(4);
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.dequeue();
        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();

        System.out.println("\nQueue:");
        myQueue.printQueue();


        /*
            EXPECTED OUTPUT:
            ----------------
            First: 1
            Last: 2
            Length: 2

            Queue:
            1
            2

        */

    }

}