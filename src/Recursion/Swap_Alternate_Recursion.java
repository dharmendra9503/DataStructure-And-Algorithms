package Recursion;

import java.util.Scanner;

/**
 *
 * I/P  --->  [1,2,3,4,5,6]
 * O/P  --->  [2,1,4,3,6,5]
 */

public class Swap_Alternate_Recursion {
    public static void swapAlternatePosition(int[] arr, int start, int size){
        if((start == size-1) || (start >= size)){
            return;
        }

        int temp = arr[start];
        arr[start] = arr[start+1];
        arr[start+1] = temp;

        swapAlternatePosition(arr, start+2, size);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int s = sc.nextInt();
        int[]  arr = new int[s];
        System.out.print("enter element of the array: ");
        for(int j=0;j<s;j++){
            arr[j] = sc.nextInt();
        }

        swapAlternatePosition(arr, 0, s);

        System.out.print("Reverse Array: ");
        for(int i=0;i<s;i++){
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }
}
