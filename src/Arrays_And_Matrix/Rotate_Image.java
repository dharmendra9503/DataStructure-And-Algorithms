package Arrays_And_Matrix;

import java.util.Scanner;

/*
 * LeetCode Problem
 *
 * Problem Number: 48
*/

public class Rotate_Image {

    public static void print(int[][] matrix, int rowSize, int colSize){
        for(int i=0;i<rowSize;i++){
            for(int j=0;j<colSize;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void rotate(int[][] matrix){
        int rowSize = matrix.length;
        int colSize = matrix[0].length;
        int sRow = 0, sCol = 0;

        for(int i=0;i<matrix.length;i++){
            int tempRow = i, tempCol = i;
            while(tempRow < rowSize){
                int temp = matrix[tempCol][sCol];
                matrix[tempCol][sCol] = matrix[sRow][tempCol];
                matrix[sRow][tempCol] = temp;

                tempRow++;
                tempCol++;
            }
            sRow++;
            sCol++;
        }

        System.out.println("Middle Solution:");
        print(matrix, rowSize, colSize);

        sCol = 0;
        int eCol = colSize-1;
        while(sCol < eCol){
            for(int i=0;i<rowSize;i++){
                int temp = matrix[i][sCol];
                matrix[i][sCol] = matrix[i][eCol];
                matrix[i][eCol] = temp;
            }
            sCol++;
            eCol--;
        }

        System.out.println("********Final Solution*******");
        print(matrix, rowSize, colSize);
        System.out.println("**************************");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rSize = sc.nextInt();
        int cSize = sc.nextInt();
        int[][] arr = new int[rSize][cSize];

        for(int i=0;i<rSize;i++){
            for(int j=0;j<cSize;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        rotate(arr);

        sc.close();
    }
}
