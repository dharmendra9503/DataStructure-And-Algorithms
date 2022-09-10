package Recursion;

import java.util.Scanner;

/**
 * I/P --->  653
 * O/P --->  six five three
 */

public class SayDigit {
    public static void printDigit(int N, String[] arr){
        //Base Case
        if(N == 0)
            return;

        //Process
        int digit = N%10;
        N = N / 10;

        //Recursion Function
        printDigit(N, arr);

        System.out.print(arr[digit]+" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        int T = sc.nextInt();  // Number of test case
        while(T-- > 0){
            int N = sc.nextInt();

            printDigit(N, arr);
            System.out.println();
        }
        sc.close();
    }
}
