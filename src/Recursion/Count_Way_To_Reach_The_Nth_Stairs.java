package Recursion;

import java.util.Scanner;

/**
 * Also in GeeksForGeeks
 * Problem Name: Count Ways To Reach The n'th Stair
 *
 *
 *
 * Problem Statement
 * Link Of the problem ---->  https://www.codingninjas.com/codestudio/problems/count-ways-to-reach-nth-stairs_798650?leftPanelTab=0
 *
 * You have been given a number of stairs. Initially, you are at the 0th stair, and you need to reach the Nth stair.
   Each time you can either climb one step or two steps. You are supposed to return the number of distinct ways in
   which you can climb from the 0th step to Nth step.
*/

public class Count_Way_To_Reach_The_Nth_Stairs {
    public static int countDistinctWayToClimbStair(long nStairs) {
        if(nStairs < 0){
            return 0;
        }
        if(nStairs == 0){
            return 1;
        }

        return countDistinctWayToClimbStair(nStairs-1) + countDistinctWayToClimbStair(nStairs-2);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            long N = sc.nextInt();

            int ans = countDistinctWayToClimbStair(N);
            System.out.println(ans);
        }
        sc.close();
    }
}
