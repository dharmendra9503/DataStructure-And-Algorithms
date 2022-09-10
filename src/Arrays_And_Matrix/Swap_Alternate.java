package Arrays_And_Matrix;

import java.util.Scanner;

/**
 *
 * I/P  --->  [1,2,3,4,5,6]
 * O/P  --->  [2,1,4,3,6,5]
 *
 */

public class Swap_Alternate {
    public static void swapAlternatePosition(int[] arr, int size){
        for(int i=0;i<size;i+=2){
            if(i == size-1){
                break;
            }
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        int[]  arr = new int[n];
        System.out.print("Enter element of the array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        swapAlternatePosition(arr, n);

        System.out.print("Reverse Array: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }
}
