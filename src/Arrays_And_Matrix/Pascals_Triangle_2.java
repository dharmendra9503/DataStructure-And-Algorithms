package Arrays_And_Matrix;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//LeetCode Problem: 119

public class Pascals_Triangle_2 {

    public static List<Integer> generate(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> resultList = new ArrayList<>();

        list.add(1);
        resultList.add(list);
        if(rowIndex == 0) {
            return list;
        }

        list = new ArrayList<>();
        list.add(1);
        list.add(1);
        resultList.add(list);
        if(rowIndex == 1){
            return list;
        }

        for(int i=2;i<=rowIndex;i++){
            list = new ArrayList<>();
            list.add(1);
            for(int j=1;j<i;j++){
                list.add(resultList.get(i-1).get(j-1) + resultList.get(i-1).get(j));
            }
            list.add(1);
            resultList.add(list);
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        List<Integer> ans = generate(N);
        System.out.println(ans);
        sc.close();
    }
}
