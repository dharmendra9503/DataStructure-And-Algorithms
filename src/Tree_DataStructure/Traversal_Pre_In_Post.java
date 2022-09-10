package Tree_DataStructure;

public class Traversal_Pre_In_Post {   //PLR

    static void preOrder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    static void inOrder(Node root){
        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data);
        inOrder(root.right);
    }

    static void postOrder(Node root){
        if(root == null){
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        /*
                        1
                      /   \
                    2       3
                  /   \
                 4     5

         */


        System.out.println("Pre Order Traversal");
        preOrder(root);
        System.out.println();

        System.out.println("In Order Traversal");
        inOrder(root);
        System.out.println();

        System.out.println("Post Order Traversal");
        postOrder(root);
        System.out.println();
    }
}
