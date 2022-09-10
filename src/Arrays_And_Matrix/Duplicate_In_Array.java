package Arrays_And_Matrix;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 * Problem In Coding Ninjas
 *
 * You are given an array ‘ARR’ of size ‘N’ containing each number between 1 and ‘N’ - 1 at least once.
 * There is a single integer value that is present in the array twice.
 * Your task is to find the duplicate integer value present in the array.
 *
 */


public class Duplicate_In_Array {

    //Brute Force Approach
    public static int duplicate(ArrayList<Integer> arr){
        int ans = 0;
        for(int i=0;i<arr.size();i++){
            int cnt = 0;
            for(int j=0;j<arr.size();j++){
                if((i != j) && (Objects.equals(arr.get(i), arr.get(j)))){
                    cnt++;
                }
            }
            if(cnt != 0){
                ans = arr.get(i);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter size of the array: ");
        int size = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        System.out.print("enter element of the array: ");

        for(int i=0;i<size;i++){
            arr.add(sc.nextInt());
        }

        int ans = duplicate(arr);

        System.out.println(ans);
        sc.close();
    }
}
