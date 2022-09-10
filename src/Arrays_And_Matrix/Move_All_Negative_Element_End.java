package Arrays_And_Matrix;

import java.util.ArrayList;
import java.util.Scanner;

public class Move_All_Negative_Element_End {
    public static void moveNegative(int[] arr){
        ArrayList<Integer> nonNegative = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();

        for (int j : arr) {
            if (j >= 0) {
                nonNegative.add(j);
            } else {
                negative.add(j);
            }
        }

        int j = 0;
        while(j < nonNegative.size()){
            arr[j] = nonNegative.get(j);
            j++;
        }

        int i=0;
        while(i < negative.size()){
            arr[j] = negative.get(i);
            j++;i++;
        }

        for(int k:arr){
            System.out.print(k+" ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        moveNegative(arr);
        sc.close();
    }
}
