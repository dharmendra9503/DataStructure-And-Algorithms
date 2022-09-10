package Linked_List.Doubly_Linked_List;

import java.util.Scanner;

public class Inserting_At_Beginning {

    Node headLeft = null;
    Node headRight = null;
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

    void print(){
        Node temp = headLeft;
        if(headLeft == null){
            System.out.println("Linked List is Empty!");
            System.out.println();
        }
        else{
            while(temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println("\n");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Inserting_At_Beginning list = new Inserting_At_Beginning();
        System.out.println("*****************\nEnter 1 for insert.\nEnter 2 for print.\nEnter 0 for Exit.\n*****************");

        boolean a = true;
        while(a){
            System.out.print("Select Operation: ");
            int select = sc.nextInt();
            if(select == 1){
                System.out.print("Enter Element Which you want to insert at beginning: ");
                list.insertBeg(sc.nextInt());
                System.out.println();
            }
            else if(select == 2){
                System.out.print("LinkedList is: ");
                list.print();
            }
            else{
                a = false;
            }

        }

    }
}
