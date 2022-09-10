package Arrays_And_Matrix;

import java.util.Scanner;

/*
 * LeetCode Problem
 *
 * Problem Number: 74
*/

public class Search_A_2d_Matrix {

    //Binary Search in 2D Array

    public static boolean searchMatrix(int[][] matrix, int target){
        int row = matrix.length;
        int col = matrix[0].length;
        int start = 0;
        int end = row*col-1;

        int mid = start + (end-start)/2;
        //int mid = start+end/2;   //This will give TLE
        while(start < end){
            int ele = matrix[mid/col][mid%col];

            if(ele == target){
                return true;
            }

            if(ele < target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
            mid = start + (end-start)/2;
            //mid = start+end/2;   //This will give TLE
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int[][] arr = new int[s1][s2];

        for(int i=0;i<s1;i++){
            for(int j=0;j<s2;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int target = sc.nextInt();
        boolean ans = searchMatrix(arr, target);

        if(ans){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

        sc.close();
    }
}
