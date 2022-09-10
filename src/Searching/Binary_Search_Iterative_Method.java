package Searching;

import java.util.Scanner;

public class Binary_Search_Iterative_Method {

    static int binarySearch(int[] arr, int key){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = (start+end)/2;

            if(arr[mid] == key){
                return mid;
            }

            if(arr[mid] > key){
                end = mid-1;
            }
            else{
                start = mid+1;
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

        System.out.println(binarySearch(arr, key));
        sc.close();
    }
}
