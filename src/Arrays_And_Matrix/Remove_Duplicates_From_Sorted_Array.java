package Arrays_And_Matrix;
import java.util.Scanner;

/*
 * LeetCode problem
 *
 * problem no: 26
*/

public class Remove_Duplicates_From_Sorted_Array {

    public static int removeDuplicate(int[] nums){
        int ind = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != nums[ind]){
                ind++;
                nums[ind] = nums[i];
            }
        }
        return ind+1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int len = removeDuplicate(arr);
        System.out.println(len);
        sc.close();
    }
}
