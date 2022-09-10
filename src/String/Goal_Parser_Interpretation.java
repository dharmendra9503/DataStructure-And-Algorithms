package String;

import java.util.Scanner;

//LeetCode Problem: 1678

public class Goal_Parser_Interpretation {

    public static String interpret(String command){
        String newStr = "";
        int i=0;
        while(i<command.length()){
            if(command.charAt(i) == 'G'){
                newStr += 'G';
                i++;
            }
            else if(command.charAt(i) == '(' && command.charAt(i+1) == ')'){
                newStr += 'o';
                i+=2;
            }
            else if(command.charAt(i) == '(' && command.charAt(i+1) == 'a'){
                newStr += "al";
                i+=4;
            }
        }

        return newStr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String ans = interpret(str);
        System.out.println(ans);
        sc.close();
    }
}
