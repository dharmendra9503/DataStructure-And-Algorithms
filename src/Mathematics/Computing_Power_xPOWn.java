package Mathematics;

import java.util.Scanner;

public class Computing_Power_xPOWn {

    //Approach 1
    /*
    public static int power(int x, int n){
        int ans = 1;
        for(int i=0;i<n;i++){
            ans = ans*x;
        }

        return ans;
    }
    */

    //Approach 2   ---->  Recursive
    /*
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }

        if(x == 0){
            return 0;
        }

        return x*power(x, n-1);
    }
    */


    //Approach 3    ----->  Recursive
    /*
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }

        if(x == 0){
            return 0;
        }

        if(n%2 == 0) {
            return power(x, n/2) * power(x, n/2);
        }
        else{
            return x * power(x, n/2) * power(x, n/2);
        }
    }
    */

    //Approach 4
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }

        if(x == 0){
            return 0;
        }

        int temp = power(x, n/2);
        temp = temp*temp;
        if(n%2 == 0){
            return temp;
        }
        else{
            return x * temp;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int n = sc.nextInt();

        int ans = power(x,n);

        System.out.println(ans);
        sc.close();
    }
}
