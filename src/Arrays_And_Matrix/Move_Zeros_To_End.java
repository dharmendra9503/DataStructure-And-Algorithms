package Arrays_And_Matrix;

import java.util.Scanner;

public class Move_Zeros_To_End {

    //Approach 1 ---> Two Pointer approach
    //Does not maintain relative order
    /*
    public static void move(int[] a){
        int start = 0, end = a.length-1;
        while(start < end){
            if(a[start] == 0 && a[end] != 0){
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
                end--;
                start++;
            }
            else if(a[start] == 0 && a[end] == 0){
                end--;
            }
            else{
                start++;
            }
        }
    }
    */


    //Approach 2
    public static void move(int[] a){

        int cnt = 0;
        for(int i=0;i<a.length;i++){
            if(a[i] != 0){
                int temp = a[i];
                a[i] = a[cnt];
                a[cnt] = temp;
                cnt++;
            }
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        move(arr);

        for(Integer i:arr){
            System.out.print(i+" ");
        }
        sc.close();
    }
}
