package Stack_DataStructure;

import java.util.Scanner;

public class StackMain_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        For Array
      /*  System.out.print("Enter Size of the Array: ");
        int size = sc.nextInt();
        StackArray stack = new StackArray(size);  */
        StackLinkedList stack = new StackLinkedList();


        System.out.println("************************\n1 ---> push\n2 ---> pop\n3 ---> Display\nAny Key ---> Exit\n************************");


        boolean a = true;
        while(a){
            System.out.print("Select Operation: ");
            int select = sc.nextInt();

            switch(select){
                case 1:
                    System.out.print("Enter value which you want to push: ");
                    stack.push(sc.nextInt());
                    System.out.println();
                    break;
//                case 2:
//                    stack.pop();
//                    System.out.println();
//                    break;
                case 3:
                    stack.display();
                    System.out.println();
                default:
                    a = false;
            }
        }


        sc.close();
    }
}
