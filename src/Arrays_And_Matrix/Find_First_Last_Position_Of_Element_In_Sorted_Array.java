package Arrays_And_Matrix;

import java.util.Scanner;

/*
* LeetCode Problem
*
* Problem Number: 34
*/

public class Find_First_Last_Position_Of_Element_In_Sorted_Array {

    public static int[] firstAndLast(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        int middle = 0;

        while(left <= right){
            middle = (left+right)/2;

            if(nums[middle] == target){
                int i = middle,j = middle;

                while (i > 0 && nums[i - 1] == target) { //Find lower boundary
                    i--;
                }
                while(j<nums.length-1 && nums[j+1] == target){
                    j++;
                }

                return new int[]{i, j};
            }
            else if(nums[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        arr = firstAndLast(arr, target);

        System.out.println(arr[0]+" "+arr[1]);
        sc.close();
    }
}
