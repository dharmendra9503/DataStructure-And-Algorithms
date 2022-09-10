package Searching;

import java.util.Scanner;

public class Find_Floor_Of_An_Element_In_Sorted_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i=0;i<len;i++){
            arr[i] = sc.nextInt();
        }

        int key = sc.nextInt();

        int floorIndex = findFloor(arr, key);

        System.out.println(floorIndex);

        sc.close();
    }

    private static int findFloor(int[] arr, int key) {
        int s = 0;
        int e = arr.length-1;
        int res = -1;


        while(s <= e){
            int mid = s + (e-s)/2;

            if(arr[mid] == key){
                return mid;
            }

            if(arr[mid] < key){
                res = mid;
                s = mid+1;
            }
            else{
                e = mid-1;
            }
        }
        return res;
    }
}
