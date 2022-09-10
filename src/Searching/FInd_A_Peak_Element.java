package Searching;

import java.util.Scanner;

//In this problem array is not sorted

//Find a peak element means ---> Element which is not smaller than neighbours

//This concept also used in leetcode problem : 540  (Please Visit)

public class FInd_A_Peak_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int element = findPeak(arr);
        System.out.println(element);

        sc.close();
    }

    private static int findPeak(int[] arr) {
        int low = 0;
        int high = arr.length-1;
        int min = Integer.MAX_VALUE;


        while(low <= high){
            int mid = low + (high-low)/2;

            if((mid == 0 || arr[mid-1] <= arr[mid]) && (mid == arr.length-1 || arr[mid+1] <= arr[mid])){
                return arr[mid];
            }

            if(mid > 0 && arr[mid-1] >= arr[mid]){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }

        return -1;

    }
}
