import java.util.*;
public class Main {
    static int n;
    static int[][] arr;
    static int MAX = Integer.MIN_VALUE;
    static List<int[]> bombPositions = new ArrayList<>();

    public static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < n;
    }
    public static void dfs(int index, int[] selectedBombs, int[] bombTypes) {
        if (index == bombPositions.size()) {
            MAX = Math.max(MAX, maxBomb(selectedBombs));
            return;
        }
        for (int bombType : bombTypes) {
            selectedBombs[index] = bombType;
            dfs(index + 1, selectedBombs, bombTypes);
        }
    }

    //폭탄 최댓값 구하기
    public static int maxBomb(int[] selectedBombs) {
        boolean[][] visited = new boolean[n][n];
        int visitedArea = 0;
        //원래 폭탄
        for (int[] pos : bombPositions) {
            int x = pos[0];
            int y = pos[1];
            visited[x][y] = true;
        }
        //폭탄 피해
        for (int i = 0; i < selectedBombs.length; i++) {
            int[] position = bombPositions.get(i);
            int bombType = selectedBombs[i];
            int x = position[0];
            int y = position[1];
            if (bombType == 1) {
                if (inRange(x - 1, y)) {
                    visited[x-1][y] = true;
                }
                if (inRange(x - 2, y)) {
                    visited[x - 2][y] = true;
                }
                if (inRange(x + 1, y)) {
                    visited[x + 1][y] = true;
                }
                if (inRange(x + 2, y)) {
                    visited[x + 2][y] = true;
                }
            }
            if (bombType == 2) {
                if (inRange(x, y - 1)) {
                    visited[x][y-1] = true;
                }
                if (inRange(x, y + 1)) {
                    visited[x][y + 1] = true;
                }
                if (inRange(x - 1, y)) {
                    visited[x - 1][y] = true;
                }
                if (inRange(x + 1, y)) {
                    visited[x + 1][y] = true;
                }
            }
            if (bombType == 3) {
                if (inRange(x - 1, y - 1)) {
                    visited[x - 1][y - 1] = true;
                }
                if (inRange(x + 1, y + 1)) {
                    visited[x + 1][y + 1] = true;
                }
                if (inRange(x + 1, y - 1)) {
                    visited[x+1][y - 1] = true;
                }
                if (inRange(x - 1, y + 1)) {
                    visited[x - 1][y + 1] = true;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (visited[i][j]) {
                    visitedArea++;
                }
            }
        }
        return visitedArea;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
                if (arr[i][j] == 1) {
                    bombPositions.add(new int[]{i, j});
                }
            }
        }
        int[] bombTypes = {1, 2, 3};
        int[] selectedBombs = new int[bombPositions.size()];

        dfs(0, selectedBombs, bombTypes);
        System.out.println(MAX);
    }
}