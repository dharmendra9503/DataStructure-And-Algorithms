package Arrays_And_Matrix;

import java.util.Scanner;

/*
* Leetcode problem
*
* Problem Number: 217
*
*/

public class Contains_Duplicate {

    /*
    public static boolean isDuplicate(int[] nums){
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
    */


    /*
       for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] == nums[j] && Math.abs(i-j) <= k){
                    return true;
                }
            }
        }
        return false;
     */
    public static boolean isDuplicate(int[] nums, int k){
        int s = 0, e = nums.length-1;
        while(s<e){
            if(nums[s] == nums[e] && Math.abs(s-e) <= k){
                return true;
            }
            s++;
            e--;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

//        boolean ans = isDuplicate(arr);

        boolean ans = isDuplicate(arr, k);
        System.out.println(ans);
        sc.close();
    }
}
