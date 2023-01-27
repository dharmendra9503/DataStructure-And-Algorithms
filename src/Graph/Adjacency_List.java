package Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class Adjacency_List {

    private static void addEdge(int u, int v, ArrayList<ArrayList<Integer>> list, int direction){
        //1 --> directed
        //0 --> undirected

        list.get(u).add(v); //Add v node at u position
        if(direction == 0){
            list.get(v).add(u); //Add u node at v position
        }
    }

    private static void printAdjList(ArrayList<ArrayList<Integer>> list){
        for(int i=0;i<list.size();i++){
            System.out.print(i + " -> ");
            for(int ele : list.get(i)){
                System.out.print(ele+", ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.print("Enter number of edges: ");
        int m = sc.nextInt();

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i=0;i<n;i++) {
            list.add(new ArrayList<Integer>());
        }

        // 1 --> directed
        // 0 --> undirected
        System.out.print("Enter direction: ");
        int direction = sc.nextInt();

        for(int i=0;i<m;i++){
            int node1 = sc.nextInt();
            int node2 = sc.nextInt();

            addEdge(node1, node2, list, direction);
        }

        printAdjList(list);
    }
}
