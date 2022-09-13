package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

//Problem: Print any subsequence which sum is equal to N.

public class Print_Subsequence_Pattern3 {
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        int N = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        sumEqualToN(0, list, arr, size, N, 0);

        sc.close();
    }

    private static boolean sumEqualToN(int i, ArrayList<Integer> list, int[] arr, int size, int N, int sum) {
        if(i == size){
            if(sum == N){
                System.out.println(list);
                return true;
            }
            return false;
        }

        list.add(arr[i]);
        sum += arr[i];
        if(sumEqualToN(i+1, list, arr, size, N, sum)){
            return true;
        }
        sum -= arr[i];
        list.remove(list.size()-1);
        if(sumEqualToN(i+1, list, arr, size, N, sum)){
            return true;
        }

        return false;
    }
}
