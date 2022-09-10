package Mathematics;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

/*
 * GeeksForGeeks problem.
 *
 * Given two arrays a[] and b[] of size n and m respectively.
 * The task is to find union between these two arrays.
 *
 * Union of the two arrays can be defined as the set containing distinct elements from both the arrays.
 * If there are repetitions, then only one occurrence of element should be printed in the union.
*/

public class Union_Of_Two_Arrays {

    //Approach 1
    public static int doUnion(int[] a, int n, int[] b, int m){
        HashSet<Integer> set1 = new HashSet<>();

        for(int i=0;i<n;i++){
            set1.add(a[i]);
        }

        for(int i=0;i<m;i++){
            set1.add(b[i]);
        }

        System.out.println(set1);
        return set1.size();
    }

    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);

        int T=sc.nextInt();
        while(T-- > 0)
        {
            int n=sc.nextInt(), m=sc.nextInt();

            int[] a=new int[n];
            int[] b=new int[m];

            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }

            for(int i=0;i<m;i++)
            {
                b[i]=sc.nextInt();
            }

            System.out.println(doUnion(a,n,b,m));
        }

    }
}
