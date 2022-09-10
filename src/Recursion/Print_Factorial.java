package Recursion;

import java.util.Scanner;

public class Print_Factorial {

//  Recursive Approach
    public static long factorial(int n){
        if(n == 1){
            return 1;
        }

        return n*factorial(n-1);
    }

//  Iterative Approach
    public static long fact(int num){
        long fact = 1;
        while(num != 0){
            fact *= num;
            num--;
        }
        return fact;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long ans = factorial(n);    //Recursive

//        long ans = fact(n);      //Iterative

        System.out.println("factorial of "+n+" is "+ans);
        sc.close();
    }
}