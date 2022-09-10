package Searching;

import java.util.Scanner;

public class Find_Pivot_In_An_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        int pivot = getPivot(arr);
        System.out.println(pivot);
        sc.close();
    }

    public static int getPivot(int[] arr) {
        int s = 0;
        int e = arr.length-1;

        while(s < e){
            int mid = s+(e-s)/2;
            if(arr[mid] >= arr[0]){
                s = mid+1;
            }
            else{
                e = mid;
            }
        }
        return s;
    }
}
