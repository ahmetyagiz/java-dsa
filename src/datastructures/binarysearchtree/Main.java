package datastructures.binarysearchtree;

public class Main {

    public static void main(String[] args) {

        BinarySearchTree myBST = new BinarySearchTree();

        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.rInsert(18);
        myBST.rInsert(52);
        myBST.rInsert(82);

        myBST.insert(27);

        System.out.println("Root: " + myBST.root.value);
        System.out.println("Contains: " + myBST.rContains(18));
        System.out.println(myBST.root.left.right.value);

        /*
            EXPECTED OUTPUT:
            ----------------
            Root: 47
            Contains: true
            27
        */

    }

}