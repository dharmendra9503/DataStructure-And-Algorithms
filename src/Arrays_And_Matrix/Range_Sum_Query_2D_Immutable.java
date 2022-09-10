package Arrays_And_Matrix;

import java.util.Scanner;

/*
 * LeetCode Problem
 *
 * Problem Number: 304
*/

public class Range_Sum_Query_2D_Immutable {
    private static int[][] data;

    /*
    //Brute Force Approach      (Sometimes it will give error)
    public static void NumMatrix(int[][] matrix){
        data = matrix;
    }

    public static int sumRegion(int row1, int col1, int row2, int col2){
        int sum = 0;
        for(int row=row1; row<=row2;row++){
            for(int col=col1; col<=col2; col++){
                sum += data[row][col];
            }
        }
        return sum;
    }
    */


    //row caching Approach      (Sometimes it will give error)
    public static void NumMatrix(int[][] matrix){
        if(matrix.length == 0 || matrix[0].length == 0){
            return;
        }

        data = new int[matrix.length][matrix[0].length+1];
        for(int row=0; row<=matrix.length;row++){
            for(int col=0; col<=matrix[0].length; col++){
                data[row][col+1] = data[row][col] + matrix[row][col];
            }
        }
    }

    public static int sumRegion(int row1, int col1, int row2, int col2){
        int sum = 0;
        for(int r=row1; r<=row2; r++){
            sum += data[r][col2+1] - data[r][col1];
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rS = sc.nextInt();
        int cS = sc.nextInt();
        int[][] arr = new int[rS][cS];

        for(int i=0;i<rS;i++){
            for(int j=0;j<cS;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int r1 = sc.nextInt(), c1= sc.nextInt(), r2 = sc.nextInt(), c2 = sc.nextInt();

        NumMatrix(arr);
        int sum = sumRegion(r1, c1, r2, c2);

        System.out.println(sum);

        sc.close();
    }
}
