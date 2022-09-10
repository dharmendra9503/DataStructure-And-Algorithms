package Recursion;

import java.util.Scanner;

public class Sum_Of_Array_Element {
    public static int sumElement(int[] arr, int size){
        if(size == 0)
            return 0;
        if(size == 1)
            return arr[0];


        return arr[size-1] + sumElement(arr, size-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size: ");
        int N = sc.nextInt();
        System.out.print("Enter Array element: ");
        int[] arr = new int[N];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int ans = sumElement(arr, N);

        System.out.println(ans);


        sc.close();
    }
}
