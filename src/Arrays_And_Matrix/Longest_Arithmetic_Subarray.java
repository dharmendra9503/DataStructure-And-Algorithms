package Arrays_And_Matrix;

/*
    *Discription of arithmetic array
    *   An arithmetic array is an array that contains at least two integers and the difference between consecutive integers are equal.
     For example, [9,10], [3,3,3], and [9,7,5,3], are arithmetic array while [1,3,3,7], [2,1,2], and [1,2,4] are not arithmetic arrays.

     *  problem
     *   I have an array of N non-negative integers. The i-th integer of the array is Ai. I wants to choose a contiguous arithmetic subarray
      from my array that have the maximum length.   PLEASE HELP ME TO DETERMINE THE LENGTH OF THE LONGEST CONTIGUOUS ARITHMETIC SUBARRAY.

*/

import java.util.Scanner;

public class Longest_Arithmetic_Subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }

        int ans = 2;
        int curr = 2;
        int diff = arr[1] - arr[0];
        int j=2;

        while(j<N){
            if(arr[j]-arr[j-1] == diff){
                curr++;
            }
            else{
                diff = arr[j]-arr[j-1];
                curr=2;
            }
            ans = Math.max(ans, curr);
            j++;
        }

        System.out.println(ans);
        sc.close();
    }
}
