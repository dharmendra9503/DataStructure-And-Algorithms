package Arrays_And_Matrix;

import java.util.Scanner;

//LeetCode Problem: 11

public class Container_With_Most_Water {

    //Original Code
    /*
    public static int solution(int[] height){
        ArrayList<Integer> water = new ArrayList<>();

        int start = 0, end = height.length-1;
        while(start < end){
            int len = end - start;
            int heir;

            if(height[end] > height[start]){
                heir = height[start];
                start++;
            }
            else if(height[end] < height[start]){
                heir = height[end];
                end--;
            }
            else{
                heir = height[start];
                if(height[start+1] > height[end-1]){
                    start++;
                }
                else{
                    end--;
                }
            }

            water.add(len* heir);
        }
        Collections.sort(water);
        return water.get(water.size()-1);
    }
    */

    //Optimized Code
    /*
    public static int solution(int[] height){
        ArrayList<Integer> water = new ArrayList<>();

        int start = 0, end = height.length-1;
        while(start < end){
            int len = end - start;
            int heir;

            if(height[end] >= height[start]){
                heir = height[start];
                start++;
            }
            else{
                heir = height[end];
                end--;
            }
            water.add(len*heir);
        }

        Collections.sort(water);
        return water.get(water.size()-1);
    }
    */


    //More Optimized Code     ---->  TLE does not exits
    public static int solution(int[] arr){
        int len = arr.length;
        int low=0,high=len-1,temp=0,res=0;

        while(low<high)
        {
            if(arr[low]<arr[high])
            {

                temp=arr[low]*(high-low);
                res=Math.max(res,temp);
                low++;
            }
            else
            {
                temp=arr[high]*(high-low);
                res=Math.max(res,temp);
                high--;

            }
        }
        return res;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int ans = solution(arr);
        System.out.println(ans);
        sc.close();
    }
}
