package Searching;

import java.util.Scanner;

public class Number_of_Times_Sorted_Array_Rotated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        int ans = sortedRotatedArray(arr);
        System.out.println(ans);
        sc.close();
    }

    private static int sortedRotatedArray(int[] arr) {
        int s = 0;
        int e = arr.length-1;

        //first we find pivot index

        while(s < e){
            int mid = s+(e-s)/2;
            if(arr[mid] >= arr[0]){
                s = mid+1;
            }
            else{
                e = mid;
            }
        }
        int pivotIndex = s;

        //Total number of times sorted array is rotated = lastIndex - pivotIndex + 1
        return (arr.length-1 - pivotIndex + 1);
    }
}
