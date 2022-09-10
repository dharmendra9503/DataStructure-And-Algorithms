package Recursion;

import java.util.Scanner;

public class Binary_Search_Recursion {

    //For Debugging
    /*
    public static void print(int[] arr, int s, int e){
        for(int i=s;i<=e;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    */

    public static boolean binarySearch(int[] arr, int start, int end, int key) {

        //print(arr, start, end);    //For debugg

        //Base Case
        //Element not found
        if(start > end)
            return false;

        int mid = (start + end)/2;

        //Base Case
        //Element found
        if(arr[mid] == key)
            return true;

        if(arr[mid] < key) {
            return binarySearch(arr, mid + 1, end, key);
        }
        else {
            return binarySearch(arr, start, mid - 1, key);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();
        System.out.print("Enter Array element: ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter Key Which You Want To Find: ");
        int key = sc.nextInt();


        boolean ans = binarySearch(arr, 0, n-1, key);

        if (ans) {
            System.out.println("Element is Present in array");
        } else {
            System.out.println("Element is not Present in array");
        }
        sc.close();
    }
}
