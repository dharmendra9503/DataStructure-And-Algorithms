package Graph;

import java.util.*;

//Note: In this we are follow index based nodes, That means if number of vertex (n) is 5 then nodes are between 0 and 5 (0 and 5 included)

public class BFS {

    private static void addEdge(int u, int v, ArrayList<ArrayList<Integer>> list, int direction) {
        //1 --> directed
        //0 --> undirected

        list.get(u).add(v); //Add v node at u position
        if(direction == 0){
            list.get(v).add(u); //Add u node at v position
        }
    }

    private static void bfs(int node, ArrayList<ArrayList<Integer>> list, boolean[] visited, ArrayList<Integer> ans) {

        //Step - 1: Create queue
        Queue<Integer> queue = new LinkedList<>();

        queue.add(node);
        visited[node] = true;

        while(!queue.isEmpty()){

            //Step - 2,3: Take front node and poll front node
            int frontNode = queue.poll();

            ans.add(frontNode);

            //Step - 4: Traverse all neighbour of front node
            for(int j : list.get(frontNode)){
                if(!visited[j]){
                    queue.add(j);
                    visited[j] = true;
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertex: ");
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

        //Step - 1: Create Adjacency List

        for(int i=0;i<m;i++){
            int node1 = sc.nextInt();
            int node2 = sc.nextInt();

            addEdge(node1, node2, list, direction);
        }

        //Step - 2: Create visited array with initial value false and size of the array is equal to number of vertex.
        boolean[] visited = new boolean[n];
        Arrays.fill(visited, false);

        //The graph can be connected or disconnected that's why need to use loop for visit all nodes that are different component.
        //Step - 4

        ArrayList<Integer> ans = new ArrayList<>(); //To store ans
        for(int i=0;i<n;i++){
            if(!visited[i]){
                bfs(i, list, visited, ans);
            }
        }

        //Print elements
        System.out.println(ans);
    }
}