package Arrays_And_Matrix;

import java.util.Scanner;

/**
 * Problem in Coding Ninjas
 *
 * You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].
 * Now, in the given array/list, 'M' numbers are present twice and one number is present only once.
 * You need to find and return that number which is unique in the array/list.
 */

public class Find_Unique {

    //First Approach
    /*
    public static int uniqueElement(int[] a, int s){
        int ans = 0;
        for(int i=0;i<s;i++){
            int cnt = 0;
            for(int j=0;j<s;j++){
                if((i != j) && (a[i] == a[j])){
                    cnt++;
                }
            }
            if(cnt == 0){
                ans = a[i];
            }
        }
        return ans;
    }
    */

    //Second Approach
    public static int unique(int[] arr){
        int ans = 0;
        for (int j : arr) {
            ans = ans ^ j;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("enter element of the array: ");

        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

//        int ans = uniqueElement(arr, size);     //For First approach

        int ans = unique(arr);     //For Second approach

        System.out.println(ans);
        sc.close();
    }
}
