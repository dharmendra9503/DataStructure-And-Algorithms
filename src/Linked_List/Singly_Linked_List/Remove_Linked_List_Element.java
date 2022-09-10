package Linked_List.Singly_Linked_List;

import java.util.Scanner;

//Doubt


public class Remove_Linked_List_Element {

    Node head;
    Node temp;

    Remove_Linked_List_Element(){
        head = null;
    }

    void insert(int val){
        Node newNode = new Node(val);

        if(head == null){
            head = newNode;
        }
        else{
            temp.next = newNode;
        }
        temp = newNode;
    }

    public void removeElements(int val) {
        temp = null;
        Node travel = head;

        if(head.next == null && head.data == val){
            head = null;
        }
        else if(head.data == val){
            head = head.next;
        }
        else{
            while(travel.next != null){
                if(travel.data == val){
                    temp.next = travel.next;
                }
                else{
                    temp = travel;
                }
                travel = travel.next;
            }
            if(travel.data == val){
                temp.next = null;
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

        Remove_Linked_List_Element ptr = new Remove_Linked_List_Element();
        ptr.insert(5);
        ptr.insert(6);
        ptr.insert(5);
        ptr.insert(6);
        ptr.insert(7);
        ptr.insert(9);
        ptr.insert(111);
        ptr.insert(522);

        ptr.removeElements(5);

        ptr.print();

        sc.close();
    }
}
