package Mathematics;

import java.util.Scanner;

public class Trailing_Zeros_In_Factorial {

    //Approach 1

    public static int countTrailingZeros(int n){
        int fact = 1;
        for(int i=2;i<=n;i++){
            fact *= i;
        }

        int res = 0;
        while(fact%10 == 0){
            res++;
            fact /= 10;
        }

        return res;
    }


    //Approach 2
    /*
    public static int countTrailingZeros(int n){
        int res = 0;
        for(int i=5;i<=n;i*=5){
            res += n/i;
        }
        return res;
    }
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int ans = countTrailingZeros(num);

        System.out.println(ans);
        sc.close();
    }
}
