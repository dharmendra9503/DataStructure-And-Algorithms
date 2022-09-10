package Stack_DataStructure;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class StackLinkedList {
    Node top;
    Node firstNode;
    Node oldTop;
    StackLinkedList() {
        top = null;
        firstNode = null;
        oldTop = null;
    }

    void push(int val){
        Node newNode = new Node(val);
        if(top == null){
            top = newNode;
            firstNode = newNode;
        }
        else{
            oldTop = top;
            top.next = newNode;
            top = newNode;
        }
    }

//    int pop(){                 // Here problem occurs when pop function call so that we need to use doubly linked list
//        if(top == null){
////            stack is empty
//            return -1;
//        }
//        else{
//            int temp = top.data;
//
//        }
//    }

    void display(){
        Node tp = firstNode;
        if(top == null){
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
}
