package String;

//LeetCode Problem: 1309

import java.util.Scanner;

public class Decrypt_String_From_Alphabet_To_Integer_Mapping {

    public static String freqAlphabets(String s){
        for(int i = 10; i <= 26; i++) {
            s = s.replaceAll(i + "#", (char)('a' + (i-1)) + "");
        }

        for(int i = 1; i <= 9; i++) {
            s = s.replaceAll(i + "", (char)('a' + (i-1)) + "");
        }

        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String ans = freqAlphabets(s);
        System.out.println(ans);
        sc.close();
    }
}
