package Mathematics;

import java.util.Scanner;

public class LCM_Of_Two_Numbers {
    //Approach 1
    /*
    public static int lcm(int A, int B){

        //Using while loop
        int res = Math.max(A, B);
        while(true){
            if(res%A == 0 && res%B == 0){
                return res;
            }
            res++;
        }


        //Using for loop

//        int res= 0;
//        for(int i=Math.max(A,B);i<A*B;i++){
//            if(i%A == 0 && i%B == 0){
//                res = i;
//                break;
//            }
//        }
//        return res;


    }
    */


    //Approach 2           A*B = gcd(A,B) * lcm(A,B);
    public static int gcd(int A, int B){
        if(B == 0){
            return A;
        }
        return gcd(B, A%B);
    }
    public static int lcm(int A, int B){
        return A*B/gcd(A,B);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt(), num2 = sc.nextInt();

        int ans = lcm(num1, num2);

        System.out.println(ans);
        sc.close();
    }
}
