package Searching;

import java.util.Scanner;

//Leetcode problem: 378   (Please revise it)

public class Kth_Smallest_Element_In_A_Sorted_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len1 = sc.nextInt();
        int len2 = sc.nextInt();
        int[][] arr = new int[len1][len1];

        for(int i=0;i<len1;i++){
            for(int j=0;j<len2;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int target = sc.nextInt();
        int ans = searchKthSmallest(arr, target);
        System.out.println(ans);
    }

    private static int searchKthSmallest(int[][] matrix, int k) {
        int len = matrix.length;
        int low = matrix[0][0];
        int high = matrix[len-1][len-1];

        while(low < high){
            int mid = low + (high - low)/2;

            int j = len-1;
            int cnt = 0;
            for(int i=0;i<len;i++){
                while(j >= 0 && matrix[i][j] > mid){
                    j--;
                }
                cnt += j+1;
            }

            if(cnt < k){
                low = mid+1;
            }
            else{
                high = mid;
            }
        }
        return low;
    }
}
