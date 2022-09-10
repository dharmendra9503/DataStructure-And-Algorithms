package Searching;

import java.util.Scanner;

public class Search_Element_In_Nearly_Sorted_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arrSize = sc.nextInt();
        int[] array = new int[arrSize];
        for(int j=0;j<arrSize;j++){
            array[j] = sc.nextInt();
        }

        int key = sc.nextInt();

        int index = searchElement(array, key);
        System.out.println(index);

        sc.close();
    }

    private static int searchElement(int[] arr, int key) {
        int s = 0;
        int e = arr.length-1;

        while(s <= e){
            int mid = s + (e-s)/2;

            if(arr[mid] == key){
                return mid;
            }

            if(mid-1 >= s && arr[mid-1] == key){
                return mid-1;
            }

            if(mid+1 <= e && arr[mid+1] == key){
                return mid+1;
            }

            if(arr[mid] < key){
                s = mid+2;
            }
            else{
                e = mid-2;
            }
        }
        return -1;
    }
}
