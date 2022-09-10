package Recursion;

import java.util.Scanner;

public class Print_N_TO_1 {

    //Without returning
    public static void printNumber(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printNumber(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        printNumber(N);
    }
}
