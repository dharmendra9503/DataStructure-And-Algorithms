package Searching;

import java.util.Scanner;

import static Searching.Binary_Search_Recursive_Method.binarySearch;

//This program will generate arrayIndexOutOfBoundException
//BCZ this program write for infinite array but in practical infinite array is not possible

public class Search_Element_In_Infinite_Sorted_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();      //This is just example   BCZ in practical infinite array is not possible
        int[] arr = new int[len];
        for(int i=0;i<len;i++){
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();  //target

        int index = searchElement(arr, x);
        System.out.println(index);

        sc.close();
    }

    private static int searchElement(int[] arr, int target) {
        if(arr[0] == target){
            return 0;
        }

        int i=1;
        while(arr[i] < target){
            i = 2*i;
        }

        if(arr[i] == target){
            return i;
        }

        return binarySearch(arr, target, i/2+1, i-1);

    }
}
