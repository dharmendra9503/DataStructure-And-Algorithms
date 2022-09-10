// Next Largest Element

package Stack_DataStructure;

import java.util.ArrayList;
import java.util.Scanner;

public class Nearest_Greatest_To_Right {
    static int top = -1;

    void push(int[] stack, int val){
        top += 1;
        stack[top] = val;
    }

    void pop(){
        top -= 1;
    }

    public static void main(String[] args) {
        Nearest_Greatest_To_Right ptr = new Nearest_Greatest_To_Right();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        ArrayList<Integer> newArr = new ArrayList<>();
        int[] stack = new int[size];

        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=size-1;i>=0;i--){
            if(top == -1){
                //If Stack is empty
                newArr.add(-1);
            }
            else if(arr[i] < stack[top]){
                newArr.add(stack[top]);
            }
            else{
                while(top != -1 && arr[i] >= stack[top]){
                    ptr.pop();
                }
                if(top == -1){
                    newArr.add(-1);
                }
                else{
                    newArr.add(stack[top]);
                }
            }
            ptr.push(stack, arr[i]);
        }

        for(int i=size-1;i>=0;i--){
            System.out.print(newArr.get(i)+" ");
        }
        sc.close();
    }
}
