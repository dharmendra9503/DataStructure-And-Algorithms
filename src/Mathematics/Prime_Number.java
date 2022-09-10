package Mathematics;

import java.util.Scanner;

public class Prime_Number {

    //Approach 1
    /*
    public static boolean isPrime(int n){
        if(n == 1){
            return false;
        }

        for(int i=2;i<n;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    */


    //Approach 2
    /*
    public static boolean isPrime(int n){
        if(n == 1){
            return false;
        }

        for(int i=2;i*i<=n;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    */


    //Approach 3
    public static boolean isPrime(int n){
        if(n == 1){
            return false;
        }
        
        if(n == 2 || n == 3){
            return true;
        }

        if(n%2 == 0 || n%3 == 0){
            return false;
        }

        for(int i=5;i*i<=n;i+=5){
            if(n%i == 0 || n%(i+2) == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        boolean check = isPrime(num);

        System.out.println(check);
        sc.close();
    }
}
