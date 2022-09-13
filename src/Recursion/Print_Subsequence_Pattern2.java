package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

//Problem: Print all subsequence which sum is equal to N and also print total number of subsequence

public class Print_Subsequence_Pattern2 {
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

        int totalSubsequence = sumEqualToN(0, list, arr, size, N, 0);

        System.out.println("Total number of subsequence which sum is equal to N: "+totalSubsequence);

        sc.close();
    }

    private static int sumEqualToN(int i, ArrayList<Integer> list, int[] arr, int size, int N, int sum) {
        if(i == size){
            if(sum == N){
                System.out.println(list);
                count++;
            }
            return count;
        }

        list.add(arr[i]);
        sum += arr[i];
        sumEqualToN(i+1, list, arr, size, N, sum);
        sum -= arr[i];
        list.remove(list.size()-1);
        return sumEqualToN(i+1, list, arr, size, N, sum);

    }
}
