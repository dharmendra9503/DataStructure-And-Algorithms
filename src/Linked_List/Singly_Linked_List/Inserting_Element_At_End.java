package Linked_List.Singly_Linked_List;

import java.util.Scanner;

public class Inserting_Element_At_End {

    Node head = null;
    void insertAtEnd(int data){
        Node newNode = new Node(data);
        Node temp = head;

        if(head == null){
            head = newNode;
        }
        else{
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void print(){
        Node temp = head;
        while(temp  != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Inserting_Element_At_End list = new Inserting_Element_At_End();
        System.out.println("Enter The value Which you want to insert at End");
        list.insertAtEnd(sc.nextInt());
        list.print();
        list.insertAtEnd(sc.nextInt());
        list.print();
        list.insertAtEnd(sc.nextInt());
        list.print();


        sc.close();
    }
}
