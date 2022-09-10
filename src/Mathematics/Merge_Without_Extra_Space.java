package Mathematics;

import java.util.*;


/*
 * GeeksForGeeks Problem
 *
 * Given two sorted arrays arr1[] of size N and arr2[] of size M.
 * Each array is sorted in non-decreasing order.
 * Merge the two arrays into one sorted array in non-decreasing order without using any extra space.
*/

public class Merge_Without_Extra_Space {

    public static void merge(int[] arr1, int[] arr2, int n, int m){
        int i = n-1, j = 0;
        while(i>=0 && j<m){
            if(arr1[i] > arr2[j]){
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
                i--;
                j++;
            }
            else{
                break;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(Integer a:arr1){
            System.out.print(a+" ");
        }
        System.out.println();
        for(Integer b:arr2){
            System.out.print(b+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int T=sc.nextInt();
        while(T-- > 0)
        {
            int N=sc.nextInt();
            int M=sc.nextInt();

            int[] arr1 = new int[N];
            int[] arr2 = new int[M];

            for(int i=0;i<N;i++){
                arr1[i]=sc.nextInt();
            }

            for(int i=0;i<M;i++){
                arr2[i]=sc.nextInt();
            }

            merge(arr1,arr2,N,M);
        }
        sc.close();
    }
}
