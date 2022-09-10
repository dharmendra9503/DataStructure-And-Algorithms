package Arrays_And_Matrix;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//LeetCode Problem: 118

public class Pascals_Triangle_1 {

    public static List<List<Integer>> generate(int numRows) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> resultList = new ArrayList<>();

        list.add(1);
        resultList.add(list);

        if(numRows == 1) {
            return resultList;
        }

        list = new ArrayList<>();
        list.add(1);
        list.add(1);
        resultList.add(list);
        if(numRows == 2){
            return resultList;
        }

        for(int i=2;i<numRows;i++){
            list = new ArrayList<>();
            list.add(1);
            for(int j=1;j<i;j++){
                list.add(resultList.get(i-1).get(j-1) + resultList.get(i-1).get(j));
            }
            list.add(1);
            resultList.add(list);
        }
        return resultList;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        List<List<Integer>> ans = generate(N);
        System.out.println(ans);
        sc.close();
    }
}
