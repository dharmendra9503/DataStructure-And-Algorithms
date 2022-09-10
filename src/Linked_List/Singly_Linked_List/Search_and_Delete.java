package Linked_List.Singly_Linked_List;

import java.util.Scanner;

public class Search_and_Delete  {

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
        Node temp = head;
        while(temp  != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Search_and_Delete list = new Search_and_Delete();

        System.out.println("Enter The value Which you want to insert at End");
        list.insertAtEnd(sc.nextInt());
//        list.print();
        list.insertAtEnd(sc.nextInt());
//        list.print();
        list.insertAtEnd(sc.nextInt());
//        list.print();
        list.insertAtEnd(sc.nextInt());


        boolean a = true;
        while(a){
            int select;
            select = sc.nextInt();
            if(select == 1){
                System.out.print("Enter Number Which You Want To Delete: ");
                list.searchDelete(sc.nextInt());
                list.print();
            }
            else{
                a = false;
            }
        }


        sc.close();
    }
}
