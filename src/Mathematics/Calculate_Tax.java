package Mathematics;

import java.util.Scanner;

//GeeksForGeeks contest problem

public class Calculate_Tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            if(N > 1000000){   //if N > 1000000 tax will be 25%
                System.out.println((int)(N*0.25));
            }
            else if(N > 100000){   //if N > 100000 tax will be 20%
                System.out.println((int)(N*0.2));
            }
            else if(N > 1000){    //if N > 1000 tax will be 10%
                System.out.println((int)(N*0.1));
            }
            else{
                System.out.println("0");
            }
        }
        sc.close();
    }
}
