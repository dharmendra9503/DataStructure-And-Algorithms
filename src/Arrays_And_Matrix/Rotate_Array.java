package Arrays_And_Matrix;

import java.util.Scanner;

/*
 * LeetCode Problem
 *
 * Problem Number: 189
*/

public class Rotate_Array {

    public static void rotateArray(int[] nums, int k){
        int[] temp = new int[nums.length];
        int j = 0;

        for(int i=0;i<nums.length;i++){
            temp[i] = nums[i];
        }

        for(int i=nums.length-k;i<nums.length;i++){
            nums[j] = temp[i];
            j++;
        }

        for(int i=0;i<nums.length-k;i++){
            nums[j] = temp[i];
            j++;
        }

        for (int value : nums) {
            System.out.print(value + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        rotateArray(arr, target);

        sc.close();
    }
}
