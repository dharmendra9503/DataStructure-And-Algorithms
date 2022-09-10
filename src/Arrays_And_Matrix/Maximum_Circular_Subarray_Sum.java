package Arrays_And_Matrix;

import java.util.Scanner;

//The task is to find maximum circular sum subarray of a given array.

public class Maximum_Circular_Subarray_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        int sum = circularSum(arr);
        System.out.println(sum);
        sc.close();
    }

    private static int circularSum(int[] arr) {
        int res = arr[0];
        for(int i=0;i<arr.length;i++){
            int sum_max = arr[i];
            int curr_max = arr[i];
            for(int j=1;j<arr.length;j++){
                int ind = (i+j)%arr.length;
                curr_max += arr[ind];
                sum_max = Math.max(sum_max, curr_max);
            }
            res = Math.max(res, sum_max);
        }
        return res;
    }
}
