package Tree_DataStructure;

public class Depth_Of_BT {

    static int depth(Node root){
        if(root == null){
            return 0;
        }

//     Logic 1
//        return Math.max(depth(root.left), depth(root.right))+1;

//     Logic 2
        int lef = 1 + depth(root.left);
        int rig = 1 + depth(root.right);
        return Math.max(lef,rig);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println(depth(root));
    }
}
