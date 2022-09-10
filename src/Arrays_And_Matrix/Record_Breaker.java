package Arrays_And_Matrix;

//  FULL PROBLEM STATEMENT IS IN GOOGLE DRIVE

/**
 * Isyana is given the number of visitors at her local theme park on N consecutive
 * days. The number of visitors on the i-th day is Vi
 *
 * . A day is record breaking if it
 *
 * satisfies both of the following conditions:
 * ● The number of visitors on the day is strictly larger than the number of
 * visitors on each of the previous days.
 * ● Either it is the last day, or the number of visitors on the day is strictly larger
 * than the number of visitors on the following day.
 * Note that the very first day could be a record breaking day!
 * Please help Isyana find out the number of record breaking days.
 */

import java.util.Scanner;

public class Record_Breaker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N+1];
        arr[N] = -1;

        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }

        int breaking = 0;
        int mx = -1;

        for(int i=0;i<N;i++){
            if(arr[i]>mx && arr[i]>arr[i+1]){
                breaking++;
            }
            mx = Math.max(mx, arr[i]);
        }
        System.out.println(breaking);
        sc.close();
    }
}
