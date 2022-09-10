package Sorting;

import Sorting.Bubble_Sort;

public class Optimized_Bubble_Sort {

    void sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){

            boolean swap = false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }

            if(!swap){
                break;          //Means already sorted
            }
        }
    }

    static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Bubble_Sort obj = new Bubble_Sort();

        int[] arr = {-2, 45, 0, 11, -9};
        obj.sort(arr);
        print(arr);
    }
}
