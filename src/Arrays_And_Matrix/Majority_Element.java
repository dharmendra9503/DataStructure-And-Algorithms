package Arrays_And_Matrix;

import java.util.Scanner;

//Majority element is an element that appears more than n/2 times in an array of size n.

public class Majority_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int element = majorElement(arr);
        System.out.println("Major Element: "+element);

        sc.close();
    }

    private static int majorElement(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int cnt = 1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    cnt++;
                }
            }
            if(cnt >= arr.length/2){
                return arr[i];
            }
        }
        return -1;
    }
}
