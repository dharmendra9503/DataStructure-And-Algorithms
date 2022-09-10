package Searching;

import java.util.Scanner;

public class First_And_Last_Position_Of_An_Element_In_Sorted_Array {

    //Second Approach
    public static int[] searchRange(int[] nums, int target) {
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

        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();  //Search key

        //First Approach
        int[] ans =new int[]{firstOcc(arr, size, k), lastOcc(arr, size, k)};

        //Second Approach
//        int[] ans = new int[2];
//        ans = searchRange(arr, k);

        System.out.println(ans[0] +" "+ ans[1]);

        sc.close();
    }


    //First Approach
    private static int firstOcc(int[] arr, int n, int k){
        int s = 0;
        int e = n-1;
        int ans = -1;
        while(s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] == k){
                ans = mid;
                e = mid-1;
            }
            else if(arr[mid] > k){
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        return ans;
    }

    private static int lastOcc(int[] arr, int n, int k){
        int s = 0;
        int e = n-1;
        int ans = -1;
        while(s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] == k){
                ans = mid;
                s = mid+1;
            }
            else if(arr[mid] > k){
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        return ans;
    }

}
