package Arrays_And_Matrix;

import java.util.Arrays;
import java.util.Scanner;

/*
 * LeetCode Problem
 * Problem Number: 4
 *
 * Also in GeeksFOrGeeks
*/

public class Median_Of_Two_Sorted_Array {

    public static double findMedian(int[] nums1, int[] nums2){
        int[] sample = new int[nums1.length+nums2.length];

        int i;
        for(i=0;i<nums1.length;i++){
            sample[i] = nums1[i];
        }
        for (int j = 0; j < nums2.length; j++) {
            int k = nums2[j];
            sample[i] = k;
            i++;
        }

        Arrays.sort(sample);

        int tot = sample.length;
        if(tot%2 != 0){
            return sample[tot/2];
        }

        return ((double)sample[tot/2]+(double)sample[(tot/2)-1])/2.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s1 = sc.nextInt(), s2 = sc.nextInt();
        int[] ar1 = new int[s1];
        int[] ar2 = new int[s2];
        for(int i=0;i<s1;i++){
            ar1[i] = sc.nextInt();
        }
        for(int i=0;i<s2;i++){
            ar2[i] = sc.nextInt();
        }

        double ans = findMedian(ar1, ar2);
        System.out.println(ans);
        sc.close();
    }
}
