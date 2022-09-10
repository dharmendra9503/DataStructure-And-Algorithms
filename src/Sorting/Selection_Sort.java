package Sorting;

import java.util.Scanner;

public class Selection_Sort {

    void sort(int[] arr){
        int n = arr.length;

        for(int i=0;i<n-1;i++){
            int min = i;
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Selection_Sort obj = new Selection_Sort();
        int[] arr = {64,25,12,22,11};
        obj.sort(arr);
        obj.print(arr);

        sc.close();
    }
}
