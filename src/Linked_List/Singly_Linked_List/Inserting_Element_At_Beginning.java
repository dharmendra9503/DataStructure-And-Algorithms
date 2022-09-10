package Linked_List.Singly_Linked_List;

import java.util.Scanner;

public class Inserting_Element_At_Beginning {
    Node head = null;
    void insertAtBeg(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void print(){
        Node temp = head;
        while(temp  != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Inserting_Element_At_Beginning list = new Inserting_Element_At_Beginning();
        System.out.println("Enter The value Which you want to insert at beginning");
        list.insertAtBeg(sc.nextInt());
        list.print();
        list.insertAtBeg(sc.nextInt());
        list.print();
        list.insertAtBeg(sc.nextInt());
        list.print();


        sc.close();
    }
}
