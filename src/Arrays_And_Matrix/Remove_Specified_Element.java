package Arrays_And_Matrix;

import java.util.Scanner;

// LeetCode Problem

// Problem Number: 27


public class Remove_Specified_Element {
    public static int removeSpecified(int[] nums, int val){
        int ind = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != val){
                ind++;
                nums[ind] = nums[i];
            }
        }
        return ind+1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int val = sc.nextInt();

        int len = removeSpecified(arr, val);
        System.out.println(len);
        sc.close();
    }
}
