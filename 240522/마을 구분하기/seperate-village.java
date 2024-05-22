import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.Collections;
    import java.util.Scanner;

    public class Main {
        static int village_num;
        static int n;
        static boolean[][] visited;
        static int[][] grid;
        static int[] dx = new int[]{1, 0, -1, 0};
        static int[] dy = new int[]{0, 1, 0, -1};
        public static boolean inRange(int x, int y) {
            return 0<=x && x<n && 0<=y && y<n;
        }

        static ArrayList<Integer> people_count = new ArrayList<>();
        public static int dfs(int x, int y)  {
            visited[x][y] = true;
            int count = 1;
            for (int i = 0; i < 4; i++) {
                int newX = x + dx[i];
                int newY = y + dy[i];
                if (inRange(newX, newY) && !visited[newX][newY] && grid[newX][newY] == 1) {
                    visited[newX][newY] = true;
                    count += dfs(newX, newY);
                }
            }
            return count;
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

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == 1 && !visited[i][j]) {
                        int people_num = dfs(i, j);
                        people_count.add(people_num);
                        village_num++;
                    }

                }
            }
            System.out.println(village_num);
            Collections.sort(people_count);
            for (int i = 0; i < people_count.size(); i++) {
                System.out.println(people_count.get(i));
            }
        }
    }