package Arrays_And_Matrix;

import java.util.Scanner;

public class Cyclically_Rotate_An_Array_By_One {
    public static void rotateByOne(int[] arr){
        int temp = arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            arr[i+1] = arr[i];
        }
        arr[0] = temp;

        for(int j:arr){
            System.out.print(j+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        rotateByOne(arr);
        sc.close();
    }
}
