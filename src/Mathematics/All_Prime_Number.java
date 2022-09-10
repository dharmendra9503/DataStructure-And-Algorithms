package Mathematics;

import java.util.Arrays;
import java.util.Scanner;

public class All_Prime_Number {

    //Approach 1
    /*
    public static void allPrime(int n){
        if(n <= 1){
            return;
        }

        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);

        for(int i=2;i*i<=n;i++){
            if(isPrime[i]){
                for(int j=2*i;j<=n;j+=i){
                    isPrime[j] = false;
                }
            }
        }

        for(int i=2;i<=n;i++){
            if(isPrime[i]){
                System.out.print(i+" ");
            }
        }
    }
    */

    //Approach 2
    //optimized
    public static void allPrime(int n){
        if(n <= 1){
            return;
        }

        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);

        for(int i=2;i<=n;i++){
            if(isPrime[i]){
                System.out.print(i+" ");
                for(int j=i*i;j<=n;j+=i){
                    isPrime[j] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        allPrime(num);


        sc.close();
    }
}
