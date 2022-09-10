package Mathematics;

import java.util.Scanner;

public class Palindrome_Numbers {

    //Iterative Approach
    public static int isPalindrome(int n){
        int rev = 0;
        while(n>0){
            int rem = n%10;
            rev = rev*10 + rem;
            n = n/10;
        }
        return rev;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int ans = isPalindrome(number);    //Iterative Approach

        if(ans == number){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        sc.close();
    }
}
