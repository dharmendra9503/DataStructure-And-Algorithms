package Arrays_And_Matrix;

//Difference between subarray and subsequence
    /*
        * Subarray
            *Subarray is a continuous part of the array
            *Number of subarrays of an array with n elements = (n*(n+1))/2

        *SubSequence
            *   A SubSequence is a sequence that can be derived an array by selecting zero or more elements,
            without changing the order of the remaining elements.
        *
    */

import java.util.Scanner;

public class Sum_Of_All_Subarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();  //Size of the array
        int[]arr = new int[N];

        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }

        int curr = 0;
        for(int i=0;i<N;i++){
            curr = 0;
            for(int j=i;j<N;j++){
                curr += arr[j];
                System.out.print(curr+" ");
            }
        }
        sc.close();
    }
}
