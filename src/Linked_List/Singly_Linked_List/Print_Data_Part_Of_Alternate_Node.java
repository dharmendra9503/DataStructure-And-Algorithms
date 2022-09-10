package Linked_List.Singly_Linked_List;

import java.util.Scanner;

public class Print_Data_Part_Of_Alternate_Node {

    Node head = null;
    Node temp = null;
    void insert(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
        }
        else{
            temp.next = newNode;
        }
        temp = newNode;
    }


    void print(){
        temp = head;
        System.out.print("Alternate data are: ");
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Print_Data_Part_Of_Alternate_Node list = new Print_Data_Part_Of_Alternate_Node();
        System.out.println("Enter The value Which you want to insert at beginning");
        for(int i=0;i<10;i++){
            list.insert(sc.nextInt());
        }


        list.print();


        sc.close();
    }
}
