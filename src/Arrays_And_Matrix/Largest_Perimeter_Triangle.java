package Arrays_And_Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Largest_Perimeter_Triangle {

    public static int largestPerimeter(int[] nums){
        Arrays.sort(nums);
        for(int i=nums.length-3;i>=0;i--){
            if(nums[i] + nums[i+1] > nums[i+2]){
                return nums[i] + nums[i+1] + nums[i+2];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        int ans = largestPerimeter(arr);
        System.out.println(ans);
        sc.close();
    }
}
