package Arrays_And_Matrix;

import java.util.Scanner;

//Leetcode problem: 240

public class Search_A_2D_Matrix_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l1 = sc.nextInt();
        int l2 = sc.nextInt();
        int[][] arr = new int[l1][l1];

        for(int i=0;i<l1;i++){
            for(int j=0;j<l2;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int target = sc.nextInt();
        boolean ans = searchIn2DMatrix(arr, target);

        if(ans){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

        sc.close();
    }

    private static boolean searchIn2DMatrix(int[][] matrix, int target) {
        int rowLen = matrix.length;
        int colLen = matrix[0].length;

        int sRow = 0;
        int sCol = colLen-1;

        while(sRow < rowLen && sCol >=0){
            int ele = matrix[sRow][sCol];
            if(ele == target){
                return true;
            }

            if(ele < target){
                sRow++;
            }
            else{
                sCol--;
            }
        }

        return false;
    }
}
