package Searching;

import java.util.Scanner;

import static Searching.Find_Pivot_In_An_Array.getPivot;

public class Search_Element_In_Sorted_Rotated_Array_Approach1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        int[] arr = new int[length];
        for(int j=0;j<length;j++){
            arr[j] = sc.nextInt();
        }
        int target = sc.nextInt();

        //First we need to find Index of pivot in the sorted rotated array
        int pivotIndex = getPivot(arr);

        //Left part of the pivot Index
        int searchInLeft = searchLeft(arr, pivotIndex-1, target);

        //If element is not present in left part then we will search in right part
        if(searchInLeft == -1){
            int searchInRight = searchRight(arr, pivotIndex, target);
            System.out.println("Index of Element: "+searchInRight);
        }
        else{
            System.out.println("Index of Element: "+searchInLeft);
        }

        sc.close();
    }

    private static int searchRight(int[] arr, int s, int target) {
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
        return -1;
    }

    private static int searchLeft(int[] arr, int e, int target) {
        int s = 0;

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
        return -1;
    }
}
