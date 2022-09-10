package Arrays_And_Matrix;

import java.util.Scanner;

/*
 * LeetCode Problem
 *
 * Problem Number: 153
*/

public class Find_Minimum_In_Rotated_Sorted_Array {
    public static int minimum(int[] nums){
        boolean flag = false;
        int ind = 0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] > nums[i+1]){
                flag = true;
                ind = i+1;
                break;
            }
        }
        if(!flag){
            return nums[0];
        }
        return nums[ind];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        int ans = minimum(arr);
        System.out.println(ans);

        sc.close();
    }
}
