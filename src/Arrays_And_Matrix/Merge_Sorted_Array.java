package Arrays_And_Matrix;

/*
 * Leetcode problem
 *
 * Problem Number: 88
*/

import java.util.Arrays;
import java.util.Scanner;

public class Merge_Sorted_Array {

    public static void merge(int[] nums1, int m, int[] nums2, int n){
        int k=((nums1.length)-(nums2.length));
        for(int j=0;j<nums2.length;j++){
            nums1[k++]=nums2[j];
        }
        Arrays.sort(nums1);
        for(int i=0;i<nums1.length;i++){
            System.out.print(nums1[i]+" ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        int M = sc.nextInt();
        int[] arr1 = new int[M];
        for(int i=0;i<M;i++){
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt(), n = sc.nextInt();

        merge(arr, m, arr1, n);


        sc.close();
    }
}
