package Heap;

import static Heap.Heapify_Algorithm.heapify;

public class Heap_Sort {

    private static void heapSort(int[] arr, int size) {

        while(size > 1){
            //step-1  swap
            int temp = arr[1];
            arr[1] = arr[size];
            arr[size] = temp;

            //step-2  size decrease
            size--;

            //step 3  Build max-heap
            heapify(arr, size, 1);
        }

    }

    private static void print(int[] arr){
        for(int i=1;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {-1, 27, 54, 50, 49, 52, 101};
        int size = arr.length-1;

        for(int i=size/2;i>0;i--){
            heapify(arr, size, i);
        }

        heapSort(arr, size);

        print(arr);
    }
}
