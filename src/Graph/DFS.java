package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class DFS {

    private static void addEdge(int u, int v, ArrayList<ArrayList<Integer>> adjList, int direction) {
        //0 --> undirected
        //1 --> directed

        adjList.get(u).add(v); //Add v node at u position
        if(direction == 0){
            adjList.get(v).add(u);  //Add u node at v position
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Vertex: ");
        int n = sc.nextInt();

        System.out.print("Enter Number of Edges: ");
        int m = sc.nextInt();

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

        for(int i=0;i<n;i++) {
            adjList.add(new ArrayList<Integer>());
        }

        // 1 --> directed
        // 0 --> undirected
        System.out.print("Enter direction: ");
        int direction = sc.nextInt();

        //Step - 1: Create Adjacency List

        for(int i=0;i<m;i++){
            int node1 = sc.nextInt();
            int node2 = sc.nextInt();

            addEdge(node1, node2, adjList, direction);
        }

        //Step - 2: Create visited array with initial value false and size of the array is equal to number of vertex.
        boolean[] visited = new boolean[n];
        Arrays.fill(visited, false);

        //The graph can be connected or disconnected that's why need to use loop for visit all nodes that are different component.
        //Step - 4
        ArrayList<Integer> ans = new ArrayList<>(); //To store ans
        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(i, adjList, visited, ans);
            }
        }

        System.out.println(ans);
    }

    //Using Stack
    /*
    private static void dfs(int index, ArrayList<ArrayList<Integer>> adjList,
                            boolean[] visited, ArrayList<Integer> ans) {
        Stack<Integer> stack = new Stack<>();
        stack.add(index);
        visited[index] = true;

        while(!stack.empty()){
            int frontNode = stack.pop();

            ans.add(frontNode);

            for(int j : adjList.get(frontNode)){
                if(!visited[j]){
                    stack.add(j);
                    visited[j] = true;
                }
            }
        }
    }
    */

    //Using Recursion
    private static void dfs(int index, ArrayList<ArrayList<Integer>> adjList,
                            boolean[] visited, ArrayList<Integer> ans) {

        ans.add(index);
        visited[index] = true;

        for(int j : adjList.get(index)){
            if(!visited[j]){
                dfs(j, adjList, visited, ans);
            }
        }
    }
}
