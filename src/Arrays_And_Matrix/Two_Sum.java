package Arrays_And_Matrix;

/*
 * Leetcode Problem
 *
 * Problem Number: 1
*/

import java.util.Scanner;

public class Two_Sum {

    public static int[] twoSum(int[] nums, int target){
        int[] ans = new int[2];
        boolean flag = false;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                    flag = true;
                    break;
                }
            }
            if(flag){
                break;
            }
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

        int target = sc.nextInt();

        arr = twoSum(arr, target);

        System.out.println(arr[0]+" "+arr[1]);
        sc.close();
    }
}
