package Searching;

//Binary search can be implementes only on a sorted list of items. If the element are not sorted, we need to sort them first.

import java.util.Scanner;

public class Binary_Search_Recursive_Method {

    static int binarySearch(int[] arr, int key, int start, int end){

        if(start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] > key) {
                return binarySearch(arr, key, start, mid - 1);
            } else {
                return binarySearch(arr, key, mid + 1, end);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();  //length of array
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }

        int key = sc.nextInt();   //Enter element which you want to find

        System.out.println(binarySearch(arr, key, 0, arr.length-1));
        sc.close();
    }
}
