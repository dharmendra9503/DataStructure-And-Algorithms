package Arrays_And_Matrix;

import java.util.Scanner;

/**
 * Problem in GeeksForGeeks
 *
 * You are given a string s. You need to reverse the string.
 *
 *
 * Another Approach is using recursion.
 */

public class Reverse_A_String {
    public static String reverseWord(String str)
    {
        String newStr = "";
        int e = str.length()-1;

        while(e >= 0){
            newStr += str.charAt(e);
            e--;
        }

        return newStr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String Which You Want To Reverse: ");
        String str = sc.nextLine();

        String reverse = reverseWord(str);
        System.out.println(reverse);

        sc.close();
    }
}
