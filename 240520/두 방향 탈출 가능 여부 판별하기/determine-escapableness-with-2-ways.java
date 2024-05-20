import java.util.*;
public class Main {
    static int n,m;

    static int[][] grid;
    static boolean[][] visited;
    static int[] dx = new int[]{1, 0};
    static int[] dy = new int[]{0, 1};
    static int answer=0;
    public static boolean inRange(int x, int y) {
        return 0<=x && x <n && 0<=y && y<m;
    }
    public static void dfs(int x, int y) {
        //x, y 0,0 ㅅㅣ작
        if (x == n - 1 && y == m - 1) {
            answer = 1;
            return;
        }
        for(int i=0;i<2;i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];
            if (inRange(newX, newY) && !visited[newX][newY] && grid[newX][newY] == 1) {
                visited[newX][newY]= true;
                dfs(newX, newY);
                visited[newX][newY] = false;
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
        visited[0][0] = true;
        dfs(0, 0);
        System.out.println(answer);
    }
}