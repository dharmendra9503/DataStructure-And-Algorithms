package Arrays_And_Matrix;

import java.util.Scanner;

public class Kth_Prefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt(), K = sc.nextInt();
            long[] arr = new long[N];
            for(int i=0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }

            for(int i=0;i<K;i++){
                for(int j=1;j<arr.length;j++){
                    arr[j] = (long) ((arr[j]+arr[j-1])%(Math.pow(10,9)+7));
                }
            }

            for (long l : arr) {
                System.out.print(l + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
