package Backtracking;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * LeetCode Problem
 *
 * Problem Number: 51
*/

public class N_Queens_I {

    public static boolean isSafe(int row, int col, char[][] board, int n){
        int x = row, y = col;
        while(y >= 0){
            if(board[x][y] == 'Q'){
                return false;
            }
            y--;
        }

        //check for diagonal
        x = row; y = col;
        while(x >= 0 && y >= 0){
            if(board[x][y] == 'Q'){
                return false;
            }
            y--;
            x--;
        }

        x = row; y = col;
        while(x < n && y >= 0){
            if(board[x][y] == 'Q'){
                return false;
            }
            y--;
            x++;
        }

        return true;
    }

    public static void solveNQueen(int col, ArrayList<ArrayList<String>> ans, char[][] board, int n){

        //Base case
        if(col == n){
            ArrayList<String> listAns = new ArrayList<>();
            String ansStr = "";

            for(int i=0;i<n;i++){
                ansStr = "";
                for(int j=0;j<n;j++){
                    if(board[i][j] == 'Q'){
                        ansStr += 'Q';
                    }
                    else{
                        ansStr += '.';
                    }
                }
                listAns.add(ansStr);
            }
            ans.add(listAns);
            return;
        }

        for(int row=0; row<n; row++){
            if (isSafe(row, col, board, n)) {
                board[row][col] = 'Q';
                solveNQueen(col+1, ans, board, n);
                //Backtrack
                board[row][col] = '.';
            }
        }
    }

    public static ArrayList<ArrayList<String>> solveNQueens(int n){
        char[][] board = new char[n][n];
        ArrayList<ArrayList<String>> ans = new ArrayList<>();

        solveNQueen(0, ans, board, n);

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<String>> ans = new ArrayList<>();

        int N = sc.nextInt();     //Size of the chessboard

        ans = solveNQueens(N);

        System.out.println(ans);

        sc.close();
    }
}
