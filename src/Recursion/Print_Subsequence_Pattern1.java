package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

//Problem: Print all subsequence

public class Print_Subsequence_Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> list = new ArrayList<>();

        subsequence(0, list, arr, size);
        sc.close();
    }

    private static void subsequence(int i, ArrayList<Integer> list, int[] arr, int size) {
        if(i == size){
            System.out.println(list);
            return;
        }

        list.add(arr[i]);
        subsequence(i+1, list, arr, size);
        list.remove(list.size()-1);
        subsequence(i+1, list, arr, size);
    }
}
