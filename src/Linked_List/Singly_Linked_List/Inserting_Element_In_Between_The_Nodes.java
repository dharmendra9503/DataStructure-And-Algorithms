package Linked_List.Singly_Linked_List;

import java.util.Scanner;

public class Inserting_Element_In_Between_The_Nodes {

    Node head = null;
    void insertBetweenTheNode(int num, int data){
        Node newNode = new Node(data);
        Node temp = head;

        if(head == null){
            System.out.println("LinkedList is Empty\nEnter value in head");
            head = newNode;
        }
        else{
            while(temp.next != null && temp.data != num){
                temp = temp.next;
            }
            if(temp.data == num) {
                newNode.next = temp.next;
                temp.next = newNode;
            }
            else{
                System.out.println("No match");
            }
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

        Inserting_Element_In_Between_The_Nodes list = new Inserting_Element_In_Between_The_Nodes();
        System.out.println("Enter The value Which you want to insert Between Node: ");
        list.insertBetweenTheNode(sc.nextInt(), sc.nextInt());
        list.print();
        list.insertBetweenTheNode(sc.nextInt(), sc.nextInt());
        list.print();
        list.insertBetweenTheNode(sc.nextInt(), sc.nextInt());
        list.print();
        list.insertBetweenTheNode(sc.nextInt(), sc.nextInt());
        list.print();

        sc.close();
    }
}
