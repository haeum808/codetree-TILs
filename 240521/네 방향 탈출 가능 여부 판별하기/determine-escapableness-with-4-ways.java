import java.util.*;
public class Main {
    static Queue<int[]> queue = new LinkedList<>();
    static int[][] grid;
    static boolean[][] visited;
    static int n;
    static int m;
    static int[] dx = new int[]{1, 0, -1, 0};
    static int[] dy = new int[]{0, 1, 0, -1};
    static int answer = 0;
    public static boolean inRange(int x, int y) {
        return 0<=x && x<n && 0<=y && y<m;
    }
    public static void bfs(int x, int y) {
        queue.add(new int[]{x, y});
        visited[x][y]= true;
        while (!queue.isEmpty()) {
            int[] currPos = queue.poll();
            int currX = currPos[0];
            int currY = currPos[1];
            if (currX == n - 1 && currY == m - 1) {
                answer = 1;
                return;
            }
            //현재 위치에서 할 작업
            for(int i=0;i<4;i++) {
                int newX = currX+dx[i];
                int newY = currY+dy[i];
                if (inRange(newX, newY) && !visited[newX][newY] && grid[newX][newY] == 1) {
                    int[] newPos = new int[]{newX, newY};
                    visited[newX][newY] = true;
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

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        bfs(0, 0);
        System.out.println(answer);
    }
}