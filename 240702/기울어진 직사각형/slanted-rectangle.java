import java.util.Scanner;

public class Main {
    static int[][] grid;
    static boolean[][] visited;
    static int n;

    public static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < n;
    }

    public static int move(int x, int y) {
        int count = 0;
        count += grid[x][y];
        for (int num = 0; num < 4; num++) {
            int tempX = x, tempY = y;
            while (true) {
                if (num == 0) {
                    tempX = tempX - 1;
                    tempY = tempY + 1;
                } else if (num == 1) {
                    tempX = tempX - 1;
                    tempY = tempY - 1;
                } else if (num == 2) {
                    tempX = tempX + 1;
                    tempY = tempY - 1;
                } else {
                    tempX = tempX + 1;
                    tempY = tempY + 1;
                }
                if (inRange(tempX, tempY) && !visited[tempX][tempY]) {
                    x = tempX;
                    y = tempY;
                    visited[x][y] = true;
                    count += grid[x][y];
                } else {
                    break;
                }
            }
        }
        return count;
    }

    public static void resetVisited() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                visited[i][j] = false;
            }
        }
    }

    public static int check() {
        int max = 0;
        if(n==3){
            int i=2;
            int j=1;
            resetVisited();
            visited[i][j] = true;
            max = move(i, j);
        } else {
            for (int i = 2; i < n; i++) {
                for (int j = 1; j < n; j++) {
                    resetVisited();
                    visited[i][j] = true;
                    int count = move(i, j);
                    max = Math.max(max, count);
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        grid = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        int max = check();
        System.out.println(max);
    }
}