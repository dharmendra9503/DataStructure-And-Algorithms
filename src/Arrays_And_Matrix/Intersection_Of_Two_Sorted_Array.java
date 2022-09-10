package Arrays_And_Matrix;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 * Problem of Coding Ninjas
 *
 * You are given two arrays 'A' and 'B' of size 'N' and 'M' respectively.
 * Both these arrays are sorted in non-decreasing order.
 * You have to find the intersection of these two arrays.
 * Intersection of two arrays is an array that consists of all the common elements occurring in both arrays.
 */


public class Intersection_Of_Two_Sorted_Array {
    public static ArrayList<Integer> intersectionArray(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2, int m){
        ArrayList<Integer> arr3 = new ArrayList<>();

        //First Approach  (Brute Force Approach)
        //This solution shows TLE in codingNinjas
        /*
        int cnt = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(Objects.equals(arr1.get(i), arr2.get(j))){
                        arr3.add(arr2.get(j));
                        arr2.set(j, -1111111);
                        cnt++;
                        break;
                }
            }
        }
        if(cnt == 0) {
            arr3.add(-1);
        }
        return arr3;
        */


        //Second Approach   (Two Pointer Approach)
        //This solution is successfully submit in codingNinjas
        int i = 0;
        int j = 0;

        while (i < n && j < m)
        {
            int ele = arr1.get(i);
            int element = arr2.get(j);
            // If both the elements are equal then we increase both the pointers.
            if (Objects.equals(ele, element))
            {
                arr3.add(ele);
                i++;
                j++;
            }
            else if (ele < element)
            {
                i++;
            }
            else
            {
                j++;
            }
        }
        return arr3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt(), M = sc.nextInt();
            ArrayList<Integer> arr1 = new ArrayList<>();
            ArrayList<Integer> arr2 = new ArrayList<>();

            for(int i=0;i<N;i++){
                arr1.add(sc.nextInt());
            }
            for(int i=0;i<M;i++){
                arr2.add(sc.nextInt());
            }

            ArrayList<Integer> arr3 = intersectionArray(arr1, N, arr2, M);

            for (Integer integer : arr3) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
