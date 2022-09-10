package Recursion;

import java.util.Scanner;

public class Linear_Search_Recursion {

    //For Debugging
    /*
    public static void print(int[] arr, int size){
        System.out.println("Size of array: "+size);
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    */

    public static boolean linearSearch(int[] arr, int size, int key){
        //print(arr, size);   //For Debugg

        if(size == 0)
            return false;

        if(arr[size-1] == key)
            return true;

        return linearSearch(arr, size-1, key);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size: ");
        int len = sc.nextInt();
        System.out.print("Enter Array element: ");
        int[] arr = new int[len];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter Key Which You Want To Find: ");
        int key = sc.nextInt();


        boolean ans = linearSearch(arr, len, key);

        if(ans){
            System.out.println("Element is Present in array");
        }
        else{
            System.out.println("Element is not Present in array");
        }

        sc.close();
    }
}
