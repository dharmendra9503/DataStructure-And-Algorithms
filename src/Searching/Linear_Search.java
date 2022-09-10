package Searching;

//Time complexity of linear search is O(n)

import java.util.Scanner;

public class Linear_Search {

    static int linearSearch(int[] arr, int key){
        for(int j=0;j<arr.length;j++){
            if(arr[j] == key){    //If key value and array element value is same then return index of that element, If Element is not found then return -1.
                return j;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();    //Size of the array
        int[] arr = new int[N];

        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }

        int key = sc.nextInt();  //Enter element which you want to find

        System.out.println(linearSearch(arr, key));
        sc.close();
    }
}
