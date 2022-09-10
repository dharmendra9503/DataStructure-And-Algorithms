package Arrays_And_Matrix;

import java.util.HashSet;
import java.util.Scanner;

/*
 * GeeksForGeeks Problem
 *
 * Problem Name: Intersection Of Two Array
 *
*/

public class Intersection_Of_Two_Array {

    public static int numberOfElementsInIntersection(int[] a, int[] b, int n, int m){
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int i=0;i<n;i++){
            set1.add(a[i]);
        }

        for(int i=0;i<m;i++) {
            set2.add(b[i]);
        }

        set1.retainAll(set2);

        return set1.size();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt();

            int a[] = new int[n];
            int b[] = new int[m];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < m; i++) {
                b[i] = sc.nextInt();
            }

            System.out.println(numberOfElementsInIntersection(a, b, n, m));

        }
        sc.close();
    }
}
