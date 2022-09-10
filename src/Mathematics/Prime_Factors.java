package Mathematics;

import java.util.Scanner;

import Mathematics.Prime_Number;

import static Mathematics.Prime_Number.isPrime;

public class Prime_Factors {

    //Approach 1
    /*
    public static void primeFactors(int n){
        for(int i=2;i<n;i++) {
            if (isPrime(i)) {
                int x = i;
                while (n%x == 0){
                    System.out.print(i+" ");
                    x *= i;
                }
            }
        }
    }
    */

    //Approach 2
    /*
    public static void primeFactors(int n){
        if(n<=1){
            return;
        }

        for(int i=2;i*i<=n;i++){
            while(n%i == 0){
                System.out.print(i+" ");
                n = n/i;
            }
        }

        if(n > 1){
            System.out.println(n);
        }
    }
    */

    //Approach 3
    public static void primeFactors(int n){
        if(n<=1){
            return;
        }

        while(n%2 == 0){
            System.out.print("2 ");
            n /= 2;
        }

        while(n%3 == 0){
            System.out.print("3 ");
            n /= 3;
        }

        for(int i=5;i*i<=n;i+=6){
            while(n%i == 0){
                System.out.print(i+" ");
                n /= i;
            }

            while(n%(i+2) == 0){
                System.out.print((i+2)+" ");
                n /= (i+2);
            }
        }

        if(n > 3){
            System.out.println(n+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        primeFactors(num);

        sc.close();
    }
}
