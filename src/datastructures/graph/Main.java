package datastructures.graph;

public class Main {

    public static void main(String[] args) {

        Graph myGraph = new Graph();

        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addVertex("C");

        myGraph.addEdge("A", "B");
        myGraph.addEdge("A", "C");
        myGraph.addEdge("B", "C");

        myGraph.removeVertex("A", "B");
        System.out.println("\nGraph:");
        myGraph.printGraph();

        /*
            EXPECTED OUTPUT:
            ----------------
            Graph:
            {A=[C], B=[C], B=[A, B]}

        */

    }

}