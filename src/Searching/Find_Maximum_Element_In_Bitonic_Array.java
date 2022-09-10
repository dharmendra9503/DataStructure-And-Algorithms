package Searching;

import java.util.Scanner;

//In this problem we need input in following order
//first elements are in strictly increasing and after some index elements are strictly decreasing order
//Like: 8 15 21 27 23 18 16 9 5

public class Find_Maximum_Element_In_Bitonic_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }

        int ans = maximumInBitonic(array);
        System.out.println(ans);

        sc.close();
    }

    private static int maximumInBitonic(int[] arr) {
        int low = 0;
        int high = arr.length-1;

        while(low <= high){
            //If only one element
            if(low == high){
                return low;
            }

            //If two element
            if(high == low+1){
                if(arr[low] > arr[high]){
                    return low;
                }
                else{
                    return high;
                }
            }

            int mid = low + (high-low)/2;
            if(arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]){
                return mid;
            }

            if(arr[mid] > arr[mid+1] && arr[mid] < arr[mid-1]){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }
}
