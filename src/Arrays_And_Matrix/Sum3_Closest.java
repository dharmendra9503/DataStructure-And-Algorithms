package Arrays_And_Matrix;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Leetcode Problem
 *
 * Problem Number: 16
*/

public class Sum3_Closest {
    public static int threeSumClosest(int[] nums, int target){
        Arrays.sort(nums);

        int ans = nums[0] + nums[1] + nums[2];
        for(int i = 0 ; i<nums.length-2 ; i++){
            int j = i+1, k = nums.length-1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(Math.abs(sum-target)<Math.abs(ans-target)){
                    ans = sum;
                }
                if(sum<target){
                    j++;
                }else if(sum>target){
                    k--;
                }else{
                    return target;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] a = new int[N];
        for(int i=0;i<N;i++){
            a[i] = sc.nextInt();
        }
        int tar = sc.nextInt();
        int ans = threeSumClosest(a, tar);
        System.out.println(ans);

        sc.close();
    }
}
