package Arrays_And_Matrix;

import java.util.Scanner;

/*
 * LeetCode Problem
 *
 * Problem Number: 1779
*/


public class Find_Nearest_Point {
    public static int nearestValidPoint(int x, int y, int[][] points){
        int min = Integer.MAX_VALUE;
        int ans = -1;

        for(int i=0;i<points.length;i++){
            if(points[i][0] == x || points[i][1] == y){
                int difference = Math.abs(x-points[i][0]) + Math.abs(y-points[i][1]);
                if(min > difference){
                    min = difference;
                    ans++;
                }
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(), y = sc.nextInt();
        int rSize = sc.nextInt();
        int[][] arr = new int[rSize][2];
        for(int i=0;i<rSize;i++){
            for(int j=0;j<2;j++){
                arr[i][j] = sc.nextInt();
            }
        }


        int ans = nearestValidPoint(x, y, arr);
        System.out.println(ans);
        sc.close();
    }
}
