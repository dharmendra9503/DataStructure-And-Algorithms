package Mathematics;

import java.util.Scanner;

/*
 * GeeksForGeeks Problem
 *
 * Problem name: Product array puzzle
 * Given an array nums[] of size n, construct a Product Array P (of same size n)
 * such that P[i] is equal to the product of all the elements of nums except nums[i].
*/

public class Product_Array_Puzzle {

    public static long[] puzzle(int[] arr, int n){
        long[] ans = new long[n];

        for(int i=0;i<n;i++){
            int p = 1;
            for(int j=0;j<n;j++){
                if(i == j){
                    continue;
                }
                else{
                    p *= arr[j];
                }
            }
            ans[i] = p;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        long[] ans = puzzle(arr, n);

        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
        sc.close();
    }
}
