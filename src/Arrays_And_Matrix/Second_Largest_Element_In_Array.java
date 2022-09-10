package Arrays_And_Matrix;

import java.util.Scanner;

public class Second_Largest_Element_In_Array {

    public static int secondLargest(int[] arr){
        int largest = 0;   //for largest element
        int res = -1;    //for second largest element

        for(int i=1;i<arr.length;i++){
            if(arr[i] > arr[largest]){
                res = largest;
                largest = i;
            }
            else if(arr[i] != arr[largest]){
                if(res == -1 || arr[i] > arr[res]){
                    res = i;
                }
            }
        }
        return res;    //return index of second-largest element
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int index = secondLargest(arr);
        System.out.println(index);
        sc.close();
    }
}
