package Sorting;

import java.util.Scanner;

public class Quick_Sort {

    private static int partition(int[] arr, int s, int e){
        int pivot = arr[s];

        int cnt = 0;
        for(int i=s+1; i<=e; i++){
            if(arr[i] <= pivot){
                cnt++;
            }
        }

        //place pivot at right position
        int pivotIndex = s+cnt;
        int temp = arr[pivotIndex];
        arr[pivotIndex] = arr[s];
        arr[s] = temp;

        //we need to arrange array
        //for this we need to place all (element <= pivot) at left and all (element > pivot) at right.
        int i=0, j=e;
        while(i < pivotIndex && j > pivotIndex){

            while(arr[i] <= pivot){
                i++;
            }
            while(arr[j] > pivot){
                j--;
            }

            if(i < pivotIndex && j > pivotIndex){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return pivotIndex;
    }

    private static void quickSort(int[] arr, int s, int e) {
        if(s >= e){
            return;
        }

        int p = partition(arr, s, e);

        //left part sort
        quickSort(arr, s, p-1);

        //right part sort
        quickSort(arr, p+1, e);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {4, 3, 7, 5, 1, 0};

        quickSort(arr, 0, arr.length-1);

        for (int j : arr) {
            System.out.print(j + " ");
        }

        sc.close();
    }
}
