package Mathematics;

import java.util.Scanner;

public class Sqrt_With_Decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int precision = sc.nextInt();
        int sqrtWithoutDecimal = sqrt(n);
        System.out.println(sqrtWithoutDecimal);

        double sqrtWithDecimal = sqrtWithDecimal(sqrtWithoutDecimal, n, precision);
        System.out.printf("%.4f", sqrtWithDecimal);

        sc.close();
    }

    private static double sqrtWithDecimal(int sqrtWithoutDecimal, int n, int precision) {
        double ans = sqrtWithoutDecimal;
        double factor = 1;

        for(int i=0;i<precision;i++){
            factor = factor/10;

            for(double j = ans; j*j<n; j+=factor){
                ans = j;
            }
        }
        return ans;
    }

    private static int sqrt(int n) {
        long s = 0;
        long e = n;

        long ans = -1;
        while(s <= e){
            long mid = s+(e-s)/2;
            if(mid*mid == n){
                return (int)mid;
            }

            if(mid*mid < n){
                ans = mid;
                s = mid+1;
            }
            else{
                e = mid -1;
            }
        }
        return (int)ans;
    }
}
