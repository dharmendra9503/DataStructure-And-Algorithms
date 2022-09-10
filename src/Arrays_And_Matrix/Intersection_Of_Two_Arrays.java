package Arrays_And_Matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//Leetcode Problem : 349

public class Intersection_Of_Two_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s1 = sc.nextInt();
        int[] nums1 = new int[s1];
        int s2 = sc.nextInt();
        int[] nums2 = new int[s2];

        for(int i=0;i<s1;i++){
            nums1[i] = sc.nextInt();
        }
        for(int i=0;i<s2;i++){
            nums2[i] = sc.nextInt();
        }

        int[] ans = intersection(nums1, nums2);
        for(int i:ans){
            System.out.print(i+" ");
        }

        sc.close();
    }

    private static int[] intersection(int[] nums1, int[] nums2) {

        int[] ans;

        if(nums1.length >= nums2.length){
            ans = find(nums1, nums2);   //Binary Search on nums1
        }
        else{
            ans = find(nums2, nums1);   //Binary Search on nums2
        }

        return ans;
    }

    private static int[] find(int[] arr1, int[] arr2) {
        ArrayList<Integer> list = new ArrayList<>();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<arr2.length;i++){
            int target = arr2[i];
            if(i > 0 && arr2[i] == arr2[i-1]){
                continue;
            }


            int s = 0;
            int e = arr1.length-1;
            while(s <= e){
                int mid = s + (e-s)/2;
                if(arr1[mid] == target){
                    list.add(target);
                    break;
                }
                else if(arr1[mid] < target){
                    s = mid+1;
                }
                else{
                    e = mid-1;
                }
            }
        }

        int[] ans = new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i] = list.get(i);
        }

        return ans;
    }
}
