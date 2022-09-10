package String;

import java.util.Scanner;

//Leetcode problem: 6095
public class Strong_Password_Checker_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        boolean ans = isStrong(str);

        System.out.println(ans);
        sc.close();
    }

    private static boolean isStrong(String password) {
        int length = password.length();
        if (length >= 8) {
            boolean lower = false;
            boolean upper = false;
            boolean digit = false;
            boolean special = false;

            for (int i = 0; i < length; i++) {
                char s = password.charAt(i);

                if (s >= 65 && s <= 90 && !upper) {
                    upper = true;
                } else if (s >= 97 && s <= 122 && !lower) {
                    lower = true;
                } else if (s >= 48 && s <= 57 && !digit) {
                    digit = true;
                } else if ((s == 33) || (s >=35 && s <= 38) ||  (s >= 40 && s <= 41) || (s == 64) || (s == 43) || (s == 95)) {
                    special = true;
                }
            }

            if (upper && lower && digit && special) {
                for (int i = 1; i < length; i++) {
                    int curr_ascii = (int) password.charAt(i);
                    int pre_ascii = (int) password.charAt(i - 1);
                    if (curr_ascii == pre_ascii) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
