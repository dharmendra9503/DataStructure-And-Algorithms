package Linked_List.Singly_Linked_List;

import java.util.Scanner;

//Method 1:  Traverse the whole linked list and count the number of nodes. Now traverse the list again till count/2 and return the node at count/2.
//Method 2:  Traverse the linked list using two pointer. Move one pointer by one node and move second pointer by two node.

public class Find_And_Delete_Middle_Of_The_LinkedList {
    Node head;
    Node temp;

    Find_And_Delete_Middle_Of_The_LinkedList(){
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

    int middleElement(){
        Node slow_pointer = head;
        Node fast_pointer = head;

        //Find the middle and previos of middle
        Node prev = null;


//        logic 1   return type is class Node
  /*      if(head.next == null)
            return null;
        Node fast = head;
        Node slow = head;
        Node prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = slow.next;
        return head;     */


//        Logic 2
  /*      while(fast_pointer.next.next != null && fast_pointer.next.next.next != null){
            fast = fast.next.next; slow = slow.next;
        }
        slow.next = slow.next.next;     */



//        logic 3
        
        while(fast_pointer != null && fast_pointer.next != null){
            fast_pointer = fast_pointer.next.next;
            prev = slow_pointer;
            slow_pointer = slow_pointer.next;
        }
        int middle = slow_pointer.data;

        //Delete the middle
        prev.next = slow_pointer.next;

        return middle;
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
        Find_And_Delete_Middle_Of_The_LinkedList ptr = new Find_And_Delete_Middle_Of_The_LinkedList();

        boolean a = true;
        while(a){
            ptr.insert(sc.nextInt());
            System.out.print("For continuation type 1 else 0: ");
            int permit = sc.nextInt();
            if(permit == 0){
                a = false;
            }
        }
        ptr.print();

        int middle = ptr.middleElement();
        System.out.println("Middle Element is: "+middle);

        ptr.print();
        sc.close();
    }
}
