package Searching;

import java.util.Scanner;

public class Minimum_Difference_Element_In_Sorted_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int diffTarget = sc.nextInt();

        int minimum = findMinimum(arr, diffTarget);
        System.out.println(minimum);

        sc.close();
    }

    private static int findMinimum(int[] arr, int target) {
        int s = 0;
        int e = arr.length-1;

        while(s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] == target){
                return mid;
            }

            if(arr[mid] < target){
                s = mid+1;
            }
            else{
                e = mid-1;
            }
        }

        if(Math.abs(arr[s] - target) > Math.abs(arr[e]  - target)){
            return e;
        }
        else{
            return s;
        }
    }
}
