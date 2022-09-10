package Arrays_And_Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Height_Checker {

    public static int heightChecker(int[] heights){
        int cnt = 0;
        int[] temp = new int[heights.length];
        System.arraycopy(heights, 0, temp, 0, heights.length);
        Arrays.sort(temp);
        for(int i=0;i<heights.length;i++){
            if(temp[i] != heights[i]){
                cnt++;
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] height = new int[size];
        for(int i=0;i<size;i++){
            height[i] = sc.nextInt();
        }

        int ans = heightChecker(height);

        System.out.println(ans);
        sc.close();
    }
}
