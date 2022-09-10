package Recursion;

import java.util.Scanner;

public class Reverse_An_Array_Recursion {
    //First Approach
    public static void reverseFirstApproach(int[] a, int s, int e){
        if(s>=e){
            return ;
        }

        int temp = a[s];
        a[s] = a[e];
        a[e] = temp;

        reverseFirstApproach(a, s+1, e-1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int N = sc.nextInt();
        int[]  arr = new int[N];
        System.out.print("Enter element of the array: ");
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }

        reverseFirstApproach(arr, 0, N-1);

        System.out.print("Reverse Array: ");
        for(int i=0;i<N;i++){
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }
}
