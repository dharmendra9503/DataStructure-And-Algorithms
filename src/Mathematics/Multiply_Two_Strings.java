package Mathematics;

import java.math.BigInteger;
import java.util.Scanner;

public class Multiply_Two_Strings {
    public static String multiply(String s1, String s2){
        BigInteger n1 = new BigInteger(s1);
        BigInteger n2 = new BigInteger(s2);

        return String.valueOf(n2.multiply(n1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        String ans = multiply(s1, s2);

        System.out.println(ans);
        sc.close();
    }
}
