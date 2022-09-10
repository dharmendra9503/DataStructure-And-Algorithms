package Recursion;

import java.util.Scanner;

public class Print_Fibonacci {

    // Recursive Approach
    public static void printFib(int first, int second, int n){
        if(n == 0){
            return;
        }

        int term = first+second;
        System.out.print(term+" ");
        printFib(second, term, n-1);
    }


    //Iterative Approach
    public static void printFibonacci(int first, int second, int n){
        for(int i=3;i<=n;i++){
            int term = first + second;
            first = second;
            second = term;

            System.out.print(term+" ");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0, b = 1;
        System.out.println("Enter Total Number Of Term Which You Want To Print");
        int n = sc.nextInt();

        System.out.print("Fibonacci Series is: ");
        System.out.print(a+" "+b+" ");

//        printFib(a, b, n-2);   //Recursive

        printFibonacci(a, b, n);  //Iterative
    }
}
