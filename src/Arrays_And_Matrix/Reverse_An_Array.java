package Arrays_And_Matrix;

import java.util.Scanner;

public class Reverse_An_Array {

    //First Approach  ----->  Two Pointer Approach
    public static void reverseFirstApproach(int[] a, int n){
        int s = 0, e = n-1;
        while (s<e){
            int temp = a[s];
            a[s] = a[e];
            a[e] = temp;
            s++;
            e--;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int size = sc.nextInt();
        int[]  arr = new int[size];
        System.out.print("Enter element of the array: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        reverseFirstApproach(arr, size);

        System.out.print("Reverse Array: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }
}
