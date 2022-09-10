package Mathematics;

import java.util.Scanner;

public class Square_Root_Of_Number {

    public static long square(int n){
        //Approach 1
        // return (long) Math.sqrt(n);

        //Approach 2
        int i=0;
        while(i*i<=n){
            i++;
        }
        return (i-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        long ans = square(num);

        System.out.println(ans);
        sc.close();
    }
}
