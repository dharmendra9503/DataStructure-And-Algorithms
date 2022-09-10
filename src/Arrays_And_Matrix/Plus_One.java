package Arrays_And_Matrix;

import java.util.Scanner;

public class Plus_One {

    public static int[] plusOne(int[] digits){
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] res = new int[digits.length];
        res[0] = 1;
        return res;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        arr = plusOne(arr);

        for(int i: arr){
            System.out.print(i+" ");
        }
        sc.close();
    }
}
