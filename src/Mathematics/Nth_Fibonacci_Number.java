package Mathematics;

import java.util.Scanner;

/*
 * GeeksForGeeks Problem
 * Problem Name: Nth Fibonacci Number
*/

public class Nth_Fibonacci_Number {
    public static long findNthTerm(int n){
        int a = 0, b = 1;
        if(n == 1)
            return 0;

        if(n == 2)
            return 1;

        for(int i=2;i<=n;i++){
            int c = (a+b)%1000000007;
            a = b;
            b = c;
        }

        return b;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        long Nth = findNthTerm(num);

        System.out.println(Nth);

        sc.close();
    }
}
