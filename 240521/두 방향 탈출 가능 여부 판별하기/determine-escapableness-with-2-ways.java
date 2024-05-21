import java.util.*;
public class Main {
    static int n;
    static int m;
    static int[] dx = new int[]{1, 0};
    static int[] dy = new int[]{0, 1};
    static int[][] grid;
    static boolean[][] visited;
    static int answer = 0;
    static Queue<int[]> queue = new LinkedList<>();

    public static boolean inRange(int x, int y){
        return 0<=x && x<n && 0<=y && y<m;
    }
    public static void bfs(int x, int y) {
        queue.add(new int[]{x, y});
        while(!queue.isEmpty()) {
            int[] curPos = queue.poll();
            int curX = curPos[0];
            int curY = curPos[1];
            if (curX == n - 1 && curY == m - 1) {
                answer = 1;
                return;
            }
            for (int i = 0; i < 2; i++) {
                int newX = curX + dx[i];
                int newY = curY + dy[i];
                if (inRange(newX, newY) && !visited[newX][newY] && grid[newX][newY] == 1) {
                    visited[newX][newY] = true;
                    int[] newPos = new int[]{newX, newY};
                    queue.add(newPos);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        grid = new int[n][m];
        visited = new boolean[n][m];

        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++){
                grid[i][j] = sc.nextInt();
            }
        }
        bfs(0, 0);
        System.out.println(answer);
    }
}