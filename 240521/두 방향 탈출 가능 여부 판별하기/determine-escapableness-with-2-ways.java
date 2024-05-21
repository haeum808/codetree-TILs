import java.util.*;
public class Main {
    static int n, m;
    static int[][] grid;
    static boolean[][] visited;
    static int[][] memo;
    static int[] dx = new int[]{1, 0};
    static int[] dy = new int[]{0, 1};

    public static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < m;
    }

    public static int dfs(int x, int y) {
        if (x == n - 1 && y == m - 1) {
            return 1;
        }
        if (memo[x][y] != -1) {
            return memo[x][y];
        }

        int paths = 0;
        for (int i = 0; i < 2; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];
            if (inRange(newX, newY) && !visited[newX][newY] && grid[newX][newY] == 1) {
                visited[newX][newY] = true;
                paths += dfs(newX, newY);
                visited[newX][newY] = false;
            }
        }

        memo[x][y] = paths;
        return paths;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        grid = new int[n][m];
        visited = new boolean[n][m];
        memo = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt();
                memo[i][j] = -1; // 메모 배열을 초기화합니다.
            }
        }

        visited[0][0] = true;
        int answer = dfs(0, 0);
        System.out.println(answer);
    }
}