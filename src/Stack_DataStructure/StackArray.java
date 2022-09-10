package Stack_DataStructure;

public class StackArray {

    int top;
    int[] stack;
    StackArray(int size){
        //top = -1 means stack is empty
        top = -1;

        //This will create a stack
        stack = new int[size];
    }


    //push function
    void push(int val){
        // Before inserting an element in a stack, we check whether the stack is full.
        if(top == stack.length-1){
            System.out.println("Stack is Overflow");
            return;
        }
        top = top+1;
        stack[top] = val;
    }

    void pop(){
        if(top == -1){
            System.out.println("Stack is Underflow(Empty)");
            return;
        }
        System.out.println("Deleted(Popped) Element is: "+stack[top]);
        top -= 1;
    }

    void display(){
        if(top == -1){
            System.out.println("Stack is Underflow(Empty)");
            return;
        }
        System.out.print("Stack Elements Are: ");
        for(int i=0;i<=top;i++){
            System.out.print(stack[i]+" ");
        }
        System.out.println();

    }

}
