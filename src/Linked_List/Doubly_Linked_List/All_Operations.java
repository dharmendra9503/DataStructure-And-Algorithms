package Linked_List.Doubly_Linked_List;

import java.util.Scanner;

public class All_Operations {

    Node headLeft = null;
    Node headRight = null;


    // 0 -----> Exit

    // 1 -----> Print
    void print(){
        Node temp = headLeft;
        if(headLeft == null){
            System.out.println("Linked List is Empty!");
        }
        else{
            while(temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    // 2 -----> Insert At Beginning
    void insertBeg(int data){
        Node newNode = new Node(data);

        if(headLeft == null){
            headLeft = newNode;
            headRight = newNode;
        }
        else{
            newNode.next = headLeft;
            headLeft.prev = newNode;
            headLeft = newNode;
        }
    }

    // 3 -----> Insert At End;
    void insertAtEnd(int data){
        Node newNode = new Node(data);

        if(headLeft == null){
            headLeft = newNode;
            headRight = newNode;
        }
        else if(headLeft == headRight){
            headLeft.next = newNode;
            newNode.prev = headLeft;
            headRight = newNode;
        }
        else{
            headRight.next = newNode;
            newNode.prev = headRight;
            headRight = newNode;
        }
    }

    //  4 ----->  Insert Element Between The Node
    void insertBetweenNode(int num, int data){
        Node newNode = new Node(data);

        Node temp = headLeft;
        if(headLeft == null){
            System.out.println("Linked List is Empty!!");
            return;
        }

        if(headLeft == headRight && headLeft.data == num){
            headLeft.next = newNode;
            newNode.prev = headLeft;
            headRight = newNode;
            return;
        }

        while(temp != null && temp.data != num){
            temp = temp.next;
        }
        if(temp != null && temp.data == num){
            if(temp == headRight){   //If temp point to last node and last node data is equivalent then I am insert node before last node.
                temp.prev.next = newNode;
                newNode.prev = temp.prev.next;
                newNode.next = temp;
                temp.prev = newNode;
            }
            else{
                temp.next.prev = newNode;
                newNode.next = temp.next;
                temp.next = newNode;
                newNode.prev = temp;
            }
        }
        else{
            System.out.println("No Match Found");
        }
    }


    // 5 ----->  Delete Node
    void delete() throws NullPointerException{

        Scanner sc = new Scanner(System.in);
        System.out.print("Select Delete Operation: ");
        int select = sc.nextInt();

        //If Linked List is Empty
        if (headLeft == null && headRight == null) {
            System.out.println("Sorry!!, LinkedList is Empty");
            return;
        }

        //If Only one Node is present in LinkedList
        if ((select == 1 || select == 2) && headLeft == headRight) {
            headLeft = null;
            headRight = null;
            System.out.println("Node Delete Successfully, And Now LinkedList is Empty");
            return;
        }


        switch (select) {
            case 1:
                headLeft = headLeft.next;
                headLeft.prev = null;
                System.out.println("Front Node Delete Successfully");
                System.out.println();
                break;
            case 2:
                headRight = headRight.prev;
                headRight.next = null;
                System.out.println("last Node Delete Successfully");
                System.out.println();
                break;
            case 3:
                System.out.println("(((Here, Linked List start from 0,   So Please count from 0)))");
                System.out.print("Enter Position: ");
                int pos = sc.nextInt();

                //Position 0 means user want to delete first node
                if(pos == 0){
                    if(headLeft == headRight){
                        //If Only one Node is present in Linked List
                        headLeft = null;
                        headRight = null;
                    }
                    else{
                        headLeft = headLeft.next;
                        headLeft.prev = null;
                    }
                    System.out.println("Position 0 Node Delete Successfully");
                }
                else{
                    Node temp = headLeft;

                    for(int i=0;i<pos-1;i++){
                        temp = temp.next;
                    }

                    if(temp.next.next == null){

                        //If this condition is true that means user want to delete the last node
                        headRight = temp;
                        headRight.next = null;
                        System.out.println(pos+" Position node deleted successfully, Which is last node");
                        System.out.println();
                    }
                    else{
                        temp.next = temp.next.next;
                        temp.next.prev = temp;
                        System.out.println(pos+" Position node deleted successfully");
                        System.out.println();
                    }
                }
                break;
            case 4:
                Node temp = headLeft;
                System.out.print("Enter Node Value Which you want to search and delete: ");
                int val = sc.nextInt();

                //If Linked List is Empty
//                if (headLeft == null && headRight == null) {
//                    System.out.println("Sorry!!, LinkedList is Empty");
//                    return;
//                }

                //If only one Node is present
                if((headRight == headLeft) && (headLeft.data == val)){
                    headRight = null;
                    headLeft = null;
                    System.out.println("Delete Node Successfully, And Now LinkedList is Empty!");
                    return;
                }

                boolean a = false;
                if((temp == headLeft) && (headLeft.data == val)){
                    headLeft = headLeft.next;
                    headLeft.prev = null;
                    System.out.println("Delete Node Successfully");
                    a = true;
                }
                else {
                    while(temp.next != null && temp.data != val){
                        temp = temp.next;
                    }

                    if(temp.data == val) {


                        if (temp.next == null) {
                            headRight = temp.prev;
                            headRight.next = null;
                            System.out.println("Delete Node Successfully");
                            a = true;
                        } else {
                            temp.prev.next = temp.next;
                            temp.next.prev = temp.prev;
                            System.out.println("Delete Node Successfully");
                            a = true;
                        }
                    }

                }

                if(!a){
                    System.out.println("No Match Found");
                }
        }


        //For the continuation.
        System.out.print("Do You want to continue the Deletion!! (Yes/No/print):  ");
        String choice = sc.next();
        if(choice.equalsIgnoreCase("yes")){
            delete();
        }
        else if(choice.equalsIgnoreCase("print")){
            System.out.print("Linked List is:  ");
            print();
            System.out.println();
            delete();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("**********************************\n[1 --> Print  AND  0 --> Exit]\n\n2 --> Insert At Beginning\n3 --> Insert At End\n4 --> Insert after specified position\n5 --> Delete Node\n**********************************");

        All_Operations list = new All_Operations();

        boolean a = true;
        while(a){
            System.out.print("Select Operation:");
            int select = sc.nextInt();
            switch(select){
                case 1:
                    System.out.print("Linked List is: ");
                    list.print();
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Enter Element Which you want to insert at beginning: ");
                    list.insertBeg(sc.nextInt());
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Enter Element Which you want to insert at End: ");
                    list.insertAtEnd(sc.nextInt());
                    System.out.println();
                    break;
                case 4:
                    System.out.print("Enter Position and value Which you want to insert after specified value: ");
                    list.insertBetweenNode(sc.nextInt(), sc.nextInt());
                    System.out.println();
                    break;
                case 5:
                    try{
                        System.out.println("-------------------------------\n1 ---> Delete At Front\n2 ---> Delete At End\n3 ---> Delete At Specific Position\n4 ---> Search and Delete\n-------------------------------");
                        list.delete();
                    }
                    catch(NullPointerException e){
                        System.out.println("Please, Enter valid Position");
                        System.out.println();
                    }
                    System.out.println();
                    break;

                case 0:
                    a = false;
            }
        }


        sc.close();
    }
}