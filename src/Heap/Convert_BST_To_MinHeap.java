package Heap;

import java.util.ArrayList;

class Node {
    int data;
    Node left, right;

    Node(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Convert_BST_To_MinHeap {
    static int index = 0;

    public static void main(String[] args) {

        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(6);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.left = new Node(5);
        root.right.right = new Node(7);

        System.out.print(
                "Preorder Traversal Before Conversion :"
                        + "\n");
        preOrder(root);

        // Function call
        convertToMinHeap(root);

        System.out.print(
                "\nPreorder Traversal After Conversion :"
                        + "\n");
        preOrder(root);
    }

    static void convertToMinHeap(Node root)
    {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        bstToArray(root, arr);

        arrToMinHeap(root, arr);
    }

    private static void arrToMinHeap(Node root, ArrayList<Integer> arr)    //This is again pre-order traversal
    {
        if (root == null) {
            return;
        }
        root.data = arr.get(index++);

        arrToMinHeap(root.left, arr);
        arrToMinHeap(root.right, arr);
    }

    private static void bstToArray(Node root, ArrayList<Integer> arr){   //This is in-order traversal.
        if(root == null){
            return;
        }

        bstToArray(root.left, arr);

        arr.add(root.data);

        bstToArray(root.right, arr);
    }

    private static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
}
