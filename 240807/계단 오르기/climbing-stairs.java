import java.util.*;
public class Main {
    static int n;
    static int[] dx = new int[]{2, 3};
    static boolean[] visited;

    public static boolean inRange(int x) {
        return 0 <= x && x <= n;
    }

    public static int bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        int answer = 0;
         while(!queue.isEmpty()) {
             int size = queue.size();
             for(int num = 0;num<size;num++) {
                 int curPos = queue.poll();
                 if(curPos == n) {
                     return answer;
                 }
                 for (int i = 0; i < 2; i++) {
                     int nx = curPos + dx[i];
                     if (inRange(nx) && !visited[nx]) {
                         visited[nx] = true;
                         queue.add(nx);
                     }
                 }
             }
             answer++;
         }
         return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        visited = new boolean[n+1];
        System.out.println(bfs(0));
    }
}