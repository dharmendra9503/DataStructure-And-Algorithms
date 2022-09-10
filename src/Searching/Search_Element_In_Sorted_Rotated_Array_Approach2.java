package Searching;

import java.util.Scanner;

public class Search_Element_In_Sorted_Rotated_Array_Approach2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        int[] arr = new int[length];
        for (int j = 0; j < length; j++) {
            arr[j] = sc.nextInt();
        }
        int target = sc.nextInt();

        int index = searchElement(arr, target);

        System.out.println(index);

        sc.close();
    }

    private static int searchElement(int[] arr, int target) {
        int s = 0;
        int e = arr.length-1;

        while(s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] == target){
                return mid;
            }

            if(arr[s] < arr[mid]){
                if(target >= arr[s] && target < arr[mid]){
                    e = mid-1;
                }
                else{
                    s = mid+1;
                }
            }

            else{
                if(target > arr[mid] && target <= arr[e]){
                    s = mid+1;
                }
                else{
                    e = mid-1;
                }
            }
        }
        return -1;
    }

}
