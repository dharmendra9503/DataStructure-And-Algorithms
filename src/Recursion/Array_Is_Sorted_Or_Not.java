package Recursion;

import java.util.Scanner;

public class Array_Is_Sorted_Or_Not {
    public static boolean isSorted(int[] arr, int size){
        if(size == 0 || size == 1)
            return true;

        if(arr[size - 1] < arr[size - 2]){
            return false;
        }
        else{
            return isSorted(arr,size-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size: ");
        int size = sc.nextInt();
        System.out.print("Enter Array element: ");
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        boolean ans = isSorted(arr, size);

        if(ans){
            System.out.println("Array is Sorted");
        }
        else{
            System.out.println("Array is Not Sorted");
        }


        sc.close();
    }
}
