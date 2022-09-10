package Arrays_And_Matrix;

//Given an array a[] of size n. For every i from 0 to n-1 output max(a[0], a[1], a[2],.......,a[i])

import java.util.Scanner;

public class Max_Till_i {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();   //Size of the array
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];

        for(int j=0;j<N;j++){
            max = Math.max(max, arr[j]);

            System.out.print(max+" ");
        }
        sc.close();
    }
}
