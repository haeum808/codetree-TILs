import java.util.*;
public class Main {
    public static class Graph {
        private boolean[][] adjMatrix;
        private boolean[] visited;
        private int numVertices;
        private int count = 0;
        //graph reset
        public Graph(int numVertices) {
            this.numVertices = numVertices;
            adjMatrix = new boolean[numVertices+1][numVertices+1];
            visited = new boolean[numVertices+1];
        }
        //add edges
        public void addEdges(int i, int j) {
            adjMatrix[i][j] = true;
            adjMatrix[j][i] = true;
        }
        //dfs
        public void dfs(int vertex) {
            visited[vertex] = true;
            count++;
            for(int i=0;i<=numVertices;i++) {
                if(adjMatrix[vertex][i] && !visited[i]) {
                    dfs(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Graph graph = new Graph(n);
        int m = sc.nextInt();


        for(int i=0;i<m;i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            graph.addEdges(x,y);
        }
        graph.dfs(1);
        System.out.println(graph.count-1);
    }
}