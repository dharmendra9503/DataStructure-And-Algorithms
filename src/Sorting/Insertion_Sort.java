package Sorting;

import java.util.Scanner;

public class Insertion_Sort {

    void sort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int key = arr[i];

            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {12,11,13,5,6};
        Insertion_Sort obj = new Insertion_Sort();

        obj.sort(arr);
        print(arr);

        sc.close();
    }
}
