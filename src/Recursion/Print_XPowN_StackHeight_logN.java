package Recursion;

public class Print_XPowN_StackHeight_logN {
    public static int calPow(int x, int n){
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }

        if(n%2 == 0){
            return calPow(x, n/2)*calPow(x, n/2);
        }
        else{
            return x*calPow(x, n/2)*calPow(x, n/2);
        }

    }

    public static void main(String[] args) {
        int X = 2, N = 5;

        int ans = calPow(X, N);
        System.out.println(X+"^"+N+" is: "+ans);
    }
}
