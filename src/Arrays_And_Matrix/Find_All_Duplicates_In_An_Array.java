package Arrays_And_Matrix;

import java.util.*;


/*
 * LeetCode Problem   --->   442
 *
 * Given an integer array nums of length n where all the integers of nums are in the range [1, n]
 * and each integer appears once or twice, return an array of all the integers that appears twice.
 * You must write an algorithm that runs in O(n) time and uses only constant extra space.
 *
*/


public class Find_All_Duplicates_In_An_Array {

    //First Approach
    //This approach give TLE in leetcode
    /*
    public static List<Integer> findDuplicate(int[] nums){
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    list.add(nums[i]);
                }
            }
        }

        return list;
    }
    */


    //Second Approach
    public static List<Integer> findDuplicate(int[] nums){
        Set<Integer> set = new TreeSet<>();

        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                set.add(nums[i]);
            }
        }
        ArrayList<Integer> list = new ArrayList<>(set);

        if(list.isEmpty()){
            list.add(-1);
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int N = sc.nextInt();

        int[] arr = new int[N];
        System.out.print("Enter element of the array: ");

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        List<Integer> ans = new ArrayList<>();
        ans = findDuplicate(arr);

        System.out.println(ans);
        sc.close();
    }
}
