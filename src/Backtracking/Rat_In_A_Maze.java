package Backtracking;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Problem in GeeksForGeeks and CodingNinjas
*/

public class Rat_In_A_Maze {

    public static boolean isSafe(int x, int y, boolean[][] visited, int[][] arr){
        if( (x>=0 && x<arr.length) && (y>=0 && y<arr.length) && !visited[x][y] && arr[x][y] ==1){
            return true;
        }
        else{
            return false;
        }
    }

    public static void printPath(int[][] arr, int x, int y, String path, ArrayList<String> pathList, boolean[][] visited){

        //THis will check initial condition(0, 0).
        if(x == -1 || x == arr.length || y == -1 || y == arr.length || visited[x][y] || arr[x][y] == 0){
            return;
        }

        //base case
        if(x == arr.length-1 && y == arr.length-1){
            pathList.add(path);
            return;
        }

        visited[x][y] = true;

        //Down
        if(isSafe(x+1, y, visited, arr)){
            printPath(arr, x+1, y,  path+'D', pathList, visited);
        }

        //left
        if(isSafe(x, y-1, visited, arr)){
            printPath(arr, x, y-1,  path+'L', pathList, visited);
        }

        //right
        if(isSafe(x, y+1, visited, arr)){
            printPath(arr, x, y+1,  path+'R', pathList, visited);
        }

        //up
        if(isSafe(x-1, y, visited, arr)){
            printPath(arr, x-1, y,  path+'U', pathList, visited);
        }
        visited[x][y] = false;

    }

    public static ArrayList<String> findSum(int[][] arr, int n){
        ArrayList<String> possiblePath = new ArrayList<>();
        String path = "";

        boolean[][] visited = new boolean[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                visited[i][j] = false;
            }
        }

        printPath(arr, 0, 0, path, possiblePath, visited);
        return possiblePath;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();   //Define dimension of matrix;
        int[][] arr = new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        ArrayList<String> list = findSum(arr, N);

        System.out.println(list);
        sc.close();
    }
}
