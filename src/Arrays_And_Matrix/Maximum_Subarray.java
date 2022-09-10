package Arrays_And_Matrix;

import java.util.Scanner;

/**
 * LeetCode Problem
 * problem Number: 53
 *
 *
 * Given an integer array nums, find the contiguous subarray
 * (containing at least one number) which has the largest sum
 * and return its sum.
 */

public class Maximum_Subarray {
    public static int maxSubArray(int[] nums){
        int sum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];

            if(sum < nums[i]){
                sum = nums[i];
            }

           maxsum = Math.max(sum, maxsum);
        }

        return maxsum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }

        int sum = maxSubArray(arr);

        System.out.println(sum);
        sc.close();
    }
}
