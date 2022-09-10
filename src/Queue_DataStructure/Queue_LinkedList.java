package Queue_DataStructure;

import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class Queue_LinkedList {

    Node front = null;
    Node rear = null;

    void enqueue(int val){
        Node newNode = new Node(val);
        if(front == null){
            front = newNode;
            rear = newNode;
        }
        else{
            rear.next = newNode;
            rear = newNode;
        }
    }

    int dequeue(){
        if(front == null){
            //Queue is Empty
            return 0;
        }
        int ans = front.data;
        front = front.next;
        return ans;
    }

    void print(){
        Node temp = front;
        if(temp == null){
            System.out.println("Queue is Empty");
        }
        else {
            while (temp != rear) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue_LinkedList ptr = new Queue_LinkedList();
        System.out.println("***********************************\n1 ---> Enqueue\n2 ---> Dequeue\n3 ---> Print\n0 ---> Exit\n***********************************");

        boolean a = true;
        while(a) {
            System.out.print("Select Operation: ");
            int select = sc.nextInt();
            switch (select) {
                case 1:
                    System.out.print("Enter value which you want to enqueue: ");
                    ptr.enqueue(sc.nextInt());
                    System.out.println();
                    break;
                case 2:
                    int deq = ptr.dequeue();
                    if(deq == 0){
                        System.out.println("Queue is Empty!!");
                    }
                    else {
                        System.out.println("Dequeued Value is: " + deq);
                    }
                    System.out.println();
                    break;
                case 3:
                    ptr.print();
                    System.out.println();
                    break;
                case 0:
                    a = false;
            }
        }
    }
}