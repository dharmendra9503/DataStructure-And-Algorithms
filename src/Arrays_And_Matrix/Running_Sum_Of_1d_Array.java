package Arrays_And_Matrix;

import java.util.Scanner;

/*
 * Leetcode Problem
 *
 * Problem Number: 1480
*/

public class Running_Sum_Of_1d_Array {
    public static int[] sumOfArray(int[] nums){
        int[] ans = new int[nums.length];
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            ans[i] = sum;
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

        arr = sumOfArray(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
