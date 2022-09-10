package Arrays_And_Matrix;

import java.util.Scanner;

/**
 *
 * Problem in GeeksForGeeks
 *
 * Given an array A of size N of integers.
 * Your task is to find the minimum and maximum elements in the array.
 */


class pair{
    long min, max;
    pair(long min, long max){
        this.min = min;
        this.max = max;
    }
}

public class Find_Minimum_And_Maximum {

    //Approach - 1   ----->  Linear Search
    /*
    public static pair getMinMax(long[] a, int N){
        long min = a[0], max = a[0];
        for(int i=1;i<N;i++){
            if(a[i] < min){
                min = a[i];
            }
            if(a[i] > max){
                max = a[i];
            }
        }

        return new pair(min, max);
    }
    */


    //Approach - 2   ----->  Compare in pairs
    public static pair getMinMax(long[] a, int N) {
        int i ;
        long min , max ;

        if (N % 2 == 0) {
            if (a[0] > a[1]) {
                max = a[0];
                min = a[1];
            } else {
                max = a[1];
                min = a[0];
            }
            i = 2;
        }
        else {
            max = a[0];
            min = a[0];
            i = 1;
        }


        while (i < N - 1) {
            if (a[i] > a[i + 1]) {
                if (a[i] > max) {
                    max = a[i];
                }
                if (a[i + 1] < min) {
                    min = a[i + 1];
                }
            } else {
                if (a[i + 1] > max) {
                    max = a[i + 1];
                }
                if (a[i] < min) {
                    min = a[i];
                }
            }
            i+=2;
        }

        return new pair(min, max);
    }

    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int N = sc.nextInt();

        long[] arr = new long[N];
        System.out.print("Enter element of the array: ");

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        pair ans = getMinMax(arr, N);

        System.out.println("Minimum Element: " + ans.min + "\nMaximum Element: " + ans.max);
        sc.close();
    }
}
