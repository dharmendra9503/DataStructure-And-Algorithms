package String;

import java.util.Scanner;

//LeetCode Problem : 1768

public class Merge_String_Alternately {

    public static String mergeAlternately(String word1, String word2){
        int n1 = word1.length(), n2 = word2.length();
        int minLength = Math.min(n1,n2);
        String newStr = "";

        int i;
        for(i=0;i<minLength;i++){
            newStr += word1.charAt(i);
            newStr += word2.charAt(i);
        }

        if(minLength == n1){
            newStr += word2.substring(i);
        }
        else{
            newStr += word1.substring(i);
        }

        return newStr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        String ans = mergeAlternately(s1, s2);
        System.out.println(ans);
        sc.close();
    }
}
