package datastructures.graph;

public class Main {

    public static void main(String[] args) {

        Graph myGraph = new Graph();

        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addVertex("C");
        myGraph.addVertex("C");
        myGraph.addVertex("D");

        myGraph.addEdge("A", "B");
        myGraph.addEdge("A", "C");
        myGraph.addEdge("B", "C");
        myGraph.addEdge("A", "D");
        myGraph.addEdge("C", "D");
        myGraph.removeEdge("A", "B");
        myGraph.removeVertex("C");
        System.out.println("\nGraph:");
        myGraph.printGraph();

        /*
            EXPECTED OUTPUT:
            ----------------
            Graph:
            {A=[D], B=[], D=[A]}

        */

    }

}