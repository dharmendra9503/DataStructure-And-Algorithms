package Recursion;

import java.util.Scanner;

public class Print_Sum_Of_First_N {
    public static void printSum(int i, int n, int sum){
        if(i == n){
            sum += n;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(i+1, n, sum);
//        System.out.println(i);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        printSum(1, N, 0);
    }
}
