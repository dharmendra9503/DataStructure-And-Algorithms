package Searching;

import java.util.Scanner;

public class Find_Ceil_Of_An_Element_In_Sorted_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ln = sc.nextInt();
        int[] arr = new int[ln];
        for(int i=0;i<ln;i++){
            arr[i] = sc.nextInt();
        }

        int key = sc.nextInt();

        int ceilIndex = findCeil(arr, key);

        System.out.println(ceilIndex);

        sc.close();
    }

    private static int findCeil(int[] arr, int key) {
        int s = 0;
        int e = arr.length-1;
        int res = -1;

        while(s <= e){
            int mid = s + (e-s)/2;

            if(arr[mid] == key){
                return mid;
            }

            if(arr[mid] < key){
                s = mid+1;
            }
            else{
                res = mid;
                e = mid-1;
            }
        }
        return res;
    }
}
