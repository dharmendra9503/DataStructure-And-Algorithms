package Graph;

import java.util.Scanner;

public class Adjacency_Matrix {

    private static void addEdge(int u, int v, int[][] matrix, int direction){
        //0 --> undirected
        //1 --> directed

        matrix[u][v] = 1;
        if(direction == 0){
            matrix[v][u] = 1;
        }
    }

    private static void printMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of nodes: ");
        int n = sc.nextInt();

        System.out.print("Enter Number of edges: ");
        int m = sc.nextInt();

        System.out.print("Enter direction: ");
        //0 --> undirected
        //1 --> directed
        int direction = sc.nextInt();

        int[][] matrix = new int[n][n];

        for(int i=0;i<m;i++){
            int node1 = sc.nextInt();
            int node2 = sc.nextInt();

            addEdge(node1, node2, matrix, direction);
        }

        printMatrix(matrix);
    }
}
