package Stack_DataStructure;

import java.util.ArrayList;
import java.util.Scanner;

public class Nearest_Smaller_To_Left {
    static int top = -1;

    void push(int[] stack, int val){
        top += 1;
        stack[top] = val;
    }

    void pop(){
        top -= 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Nearest_Smaller_To_Left ptr = new Nearest_Smaller_To_Left();

        System.out.print("Enter Array Size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        int[] stack = new int[size];
        ArrayList<Integer> newArr = new ArrayList<>();

        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<size;i++){
            if(top == -1){
                newArr.add(-1);
            }
            else if(arr[i] > stack[top]){
                newArr.add(stack[top]);
            }
            else{
                while(top != -1 && stack[top] >= arr[i]){
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

        for(int i=0;i<size;i++){
            System.out.print(newArr.get(i)+" ");
        }
    }
}
