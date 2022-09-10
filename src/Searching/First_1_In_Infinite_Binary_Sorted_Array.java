package Searching;

//Problem statement: Find the index of first 1 in infinite binary sorted array


//This program will generate arrayIndexOutOfBoundException
//BCZ this program write for infinite array but in practical infinite array is not possible

import java.util.Scanner;

public class First_1_In_Infinite_Binary_Sorted_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();      //This is just example   BCZ in practical infinite array is not possible
        int[] arr = new int[len];
        for(int i=0;i<len;i++){
            arr[i] = sc.nextInt();
        }

        int index = searchElement(arr);
        System.out.println(index);

        sc.close();
    }

    private static int searchElement(int[] arr) {
        if(arr[0] == 1){
            return 0;
        }

        int i=1;
        while(arr[i] == 0){
            i = 2*i;
        }

        return find1stFirst(arr, i/2+1, i);
    }

    private static int find1stFirst(int[] arr, int s, int e){
        int ans = -1;

        while(s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] == 1){
                ans = mid;
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        return ans;
    }
}
