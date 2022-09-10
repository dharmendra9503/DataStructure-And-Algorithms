package Mathematics;

import java.util.Scanner;

public class GCD_or_HCF {

    //Approach 1
    /*
    public static int gcd(int A, int B){
        int gcd = 0;
        for(int i=Math.min(A,B);i>0;i--){
            if(A%i == 0 && B%i == 0){
                gcd = i;
                break;
            }
        }
        return gcd;
    }
    */


    //Approach 2  ---> Euclid Algorithm
    /*
    public static int gcd(int A, int B){
        while(A != B){
            if(A > B){
                A = A-B;
            }
            else{
                B = B-A;
            }
        }
        return A;
    }
    */

    //Approach 3   ---> Optimized Euclid Algoithm
    public static int gcd(int A, int B){
        if(B == 0){
            return A;
        }
        return gcd(B, A%B);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt(), num2 = sc.nextInt();

        int ans = gcd(num1, num2);

        System.out.println(ans);
        sc.close();
    }
}
