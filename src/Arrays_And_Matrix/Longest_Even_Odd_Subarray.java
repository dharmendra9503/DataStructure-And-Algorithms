package Arrays_And_Matrix;

import java.util.Scanner;

//An interesting array problem to find the length of the longest
//subarray that has alternating even odd elements.

public class Longest_Even_Odd_Subarray {

    //Naive Approach
    /*
    private static int evenOddSubarray(int[] arr){
        int res = 1;
        for(int i=0;i<arr.length;i++){
            int curr = 1;
            for(int j=i+1;j<arr.length;j++){
                if((arr[j]%2 == 0 && arr[j-1]%2 != 0) || (arr[j]%2 != 0 && arr[j-1]%2 == 0)){
                    curr++;
                }
                else{
                    break;
                }
            }
            res = Math.max(res, curr);
        }
        return res;
    }
    */


    //Optimized Approach
    private static int evenOddSubarray(int[] arr) {
        int res = 1, curr = 1;
        for(int j=1;j<arr.length;j++){
            if((arr[j]%2 == 0 && arr[j-1]%2 != 0) || (arr[j]%2 != 0 && arr[j-1]%2 == 0)){
                curr++;
                res = Math.max(res, curr);
            }
            else{
                curr = 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] array = new int[size];
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        int length = evenOddSubarray(array);
        System.out.println("Length: "+length);
        sc.close();
    }

}
