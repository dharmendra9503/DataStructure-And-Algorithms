package Arrays_And_Matrix;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * LeetCode Problem
 *
 * Problem Number: 54
*/

public class Spiral_Matrix {

    public static List<Integer> spiralOrder(int[][] matrix){
        List<Integer> spiOrder = new ArrayList<>();

        int row = matrix.length;
        int col = matrix[0].length;

        int total = row*col;
        int cnt = 0;

        int sRow = 0;
        int sCol = 0;
        int eCol = col-1;
        int eRow = row-1;

        while(cnt<total){
            //Print starting row
            for(int index=sCol; cnt<total && index<=eCol;index++){
                spiOrder.add(matrix[sRow][index]);
                cnt++;
            }
            sRow++;

            //Print ending column
            for(int index=sRow;cnt<total && index<=eRow;index++){
                spiOrder.add(matrix[index][eCol]);
                cnt++;
            }
            eCol--;

            //Print ending row
            for(int index=eCol;cnt<total && index>=sCol;index--){
                spiOrder.add(matrix[eRow][index]);
                cnt++;
            }
            eRow--;

            //Print starting column
            for(int index=eRow;cnt<total && index>=sRow;index--){
                spiOrder.add(matrix[index][sCol]);
                cnt++;
            }
            sCol++;
        }
        return spiOrder;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rowSize = sc.nextInt();
        int colSize = sc.nextInt();
        int[][] arr = new int[rowSize][colSize];
        for(int i=0;i<rowSize;i++){
            for(int j=0;j<colSize;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        List<Integer> ans = spiralOrder(arr);

        System.out.println(ans);

        sc.close();
    }
}
