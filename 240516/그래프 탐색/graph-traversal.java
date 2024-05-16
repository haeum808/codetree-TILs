import java.util.*;
public class Main {
    public static class Graph {
        private List<List<Integer>> adilists;
        private boolean[] visited;
        private int count =0;

        //graph reset
        public Graph(int nodes) {
            adilists = new ArrayList<>();
            visited = new boolean[nodes];
            for(int i=0;i<nodes;i++) {
                adilists.add(new ArrayList<>());
            }
        }
        //add nodes
        public void addEdges(int src, int dest) {
            adilists.get(src).add(dest);
        }
        public void DFS(int vertex) {
            visited[vertex] = true;

            List<Integer> nodes = adilists.get(vertex);
            for(Integer node: nodes) {
                if(!visited[node]) {
                    DFS(node);
                    count++;
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
        graph.DFS(1);
        System.out.println(graph.count);
    }
}