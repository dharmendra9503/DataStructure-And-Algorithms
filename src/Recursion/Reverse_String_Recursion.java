package Recursion;

import java.util.Collections;
import java.util.Scanner;

public class Reverse_String_Recursion {
    public static void reverse(String str){
        //base case
        if ((str==null)||(str.length() <= 1))
            System.out.println(str);
        else
        {
            System.out.print(str.charAt(str.length()-1));
            reverse(str.substring(0,str.length()-1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        reverse(str);

        sc.close();
    }
}
