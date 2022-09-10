package Tree_DataStructure;

public class InOrder_Traversal_Without_Recursion_And_Without_Stack {

    /*   Using Morris Traversal, we can traverse the tree without using stack and recursion.
    The idea of Morris Traversal is based on Threaded Binary Tree.   */
    static void traversal(Node root){
        Node curr, prev;
        if(root == null){
            return;
        }

        curr = root;

        while(curr != null){
            if(curr.left == null){
                System.out.print(curr.data+" ");
                curr = curr.left;
            }
        }

    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        traversal(root);
    }
}
