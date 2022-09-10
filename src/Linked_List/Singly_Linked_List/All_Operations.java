package Linked_List.Singly_Linked_List;

import java.util.Scanner;

public class All_Operations {

    Node head = null;
    Node temp;

    //Insert Element.   Insert Element At the End
    void insertElement(int data){
        Node newNode = new Node(data);
//        temp = head;

        if(head == null){
            head = newNode;
        }
        else{
            temp.next = newNode;
        }
        temp = newNode;
    }

    //Insert At Beginning
    void insertBeginning(int data){
        Node newNode = new Node(data);
        if(head != null){
            newNode.next = head;
            head = newNode;
        }
        else{
            head = newNode;
            temp = newNode;
        }
    }

    //searching and delete
    void searchDelete(int num){
        Node temp = head;

        if(head == null){
            System.out.println("Sorry! LinkedList is empty");
        }
        else if(head.data == num){
            if(head.next == null){
                head = null;
            }
            else{
                head = head.next;
            }
        }
        else{
            while(temp.next.next != null && temp.next.data != num){
                temp = temp.next;
            }
            if(temp.next.data == num){
                if(temp.next.next == null){
                    temp.next = null;
                }
                else{
                    temp.next = temp.next.next;
                }
            }
            else{
                System.out.println("No Match Found");
            }

        }
    }


    void print(){
        Node tp = head;
        if(head == null){
            System.out.print("Empty");
        }
        else{
            while(tp != null){
                System.out.print(tp.data+" ");
                tp = tp.next;
            }
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        All_Operations list = new All_Operations();
        System.out.println("****************************************************\nEnter 1 for insert element.\nEnter 2 for insert Element at Beginning.\nEnter 3 for insert Element at End.\nEnter 4 for delete Element.\nEnter 5 for display LinkedList.\nEnter 0 for Exit.\n****************************************************");


        boolean a = true;
        while(a){
            System.out.print("Select Operation: ");
            int select = sc.nextInt();
            switch (select){
                case 1:
                    System.out.print("Enter value which you want to insert: ");
                    list.insertElement(sc.nextInt());
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Enter value which you want to insert At Beginning: ");
                    list.insertBeginning(sc.nextInt());
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Enter value which you want to insert At End: ");
                    list.insertElement(sc.nextInt());
                    System.out.println();
                    break;
                case 4:
                    System.out.print("Enter Number Which You Want To Delete: ");
                    list.searchDelete(sc.nextInt());
                    System.out.println();
                    break;
                case 5:
                    System.out.print("LinkedList is: ");
                    list.print();
                    System.out.println();
                    break;
                case 0:
                    a = false;
            }
        }
    }
}
