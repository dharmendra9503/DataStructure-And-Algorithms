package Mathematics;

import java.util.Scanner;

public class Count_Digit {
    //Iterative Approach
    /*
    public static int countDigit(int n){
        int cnt = 0;
        while(n>0){
            n = n/10;
            cnt++;
        }

        return cnt;
    }
    */

    //Recursive Approach
    public static int countDigit(int n){
        if(n <= 0){
            return 0;
        }
        return 1 + countDigit(n/10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int totalDigit = countDigit(num);

        System.out.println("Total Digits: "+totalDigit);

        sc.close();
    }
}
