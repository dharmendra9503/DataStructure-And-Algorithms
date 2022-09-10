package Sorting;

//This program merge two sorted array
//If array is unsorted then first you need to sort those array and after merge array.

import java.util.Arrays;

public class Merge_Example {

    public static int[] merge(int[] a1, int[] a2){

        int size = a1.length+a2.length;
        int[] fArray = new int[size];

        int i = 0, j = 0;
        int k = 0;
        while(i < a1.length && j < a2.length){
            if(a1[i] < a2[j]){
                fArray[k] = a1[i];
                i++;
            }
            else{
                fArray[k] = a2[j];
                j++;
            }
            k++;
        }

        while(i < a1.length){
            fArray[k] = a1[i];
            k++;
            i++;
        }

        while(j < a2.length){
            fArray[k] = a2[j];
            k++;
            j++;
        }

        return fArray;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {9,11,23,25, 28, 35, 95};

        int[] finalArr = merge(arr1, arr2);
        System.out.println(Arrays.toString(finalArr));
    }
}
