package Arrays_And_Matrix;

import java.util.Scanner;

//LeetCode Problem: 42
//Also in GeeksForGeeks

public class Trapping_Rain_Water {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        int ans = trappingWater(arr);
        System.out.println(ans);

        sc.close();
    }

    //Optimized Approach O(n)
    private static int trappingWater(int[] arr) {
        int res = 0;
        int[] lmax = new int[arr.length];
        int[] rmax = new int[arr.length];

        lmax[0] = arr[0];
        rmax[rmax.length-1] = arr[arr.length-1];

        for(int i=1;i<arr.length;i++){
            lmax[i] = Math.max(arr[i], lmax[i-1]);
        }

        for(int i=arr.length-2;i>=0;i--){
            rmax[i] = Math.max(arr[i], rmax[i+1]);
        }

        for(int i=1;i<arr.length-1;i++){
            res = res + (Math.min(lmax[i], rmax[i]) - arr[i]);
        }

        return res;
    }


    //Naive Approach  Time taken O(n2)
    /*
    private static int trappingWater(int[] arr) {
        int res = 0;
        for(int i=1;i<arr.length-1;i++){
            int lmax = arr[i];
            for(int j=0;j<i;j++){
                lmax = Math.max(lmax, arr[j]);
            }

            int rmax = arr[i];
            for(int j=i+1;j<arr.length;j++){
                rmax = Math.max(rmax, arr[j]);
            }

            res += Math.min(lmax,rmax)-arr[i];
        }

        return res;
    }
    */


}
