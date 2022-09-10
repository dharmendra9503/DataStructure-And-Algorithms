package Tree_DataStructure;

import java.util.Stack;

public class InOrder_Traversal_Witout_Recursion {

//    Tree Traversal without recursion using stack
    static void inOrder(Node root){
        if(root == null){
            return;
        }

        Stack<Node> s = new Stack<Node>();
        Node temp = root;

//        traverse the tree
        while(temp != null || s.size() > 0){

            while(temp != null){
                s.push(temp);
                temp = temp.left;
            }

            temp = s.pop();

            System.out.print(temp.data+" ");

            temp = temp.right;
        }
    }
    public static void main(String[] args) {
        /* creating a binary tree and entering
        the nodes */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        inOrder(root);
    }
}
