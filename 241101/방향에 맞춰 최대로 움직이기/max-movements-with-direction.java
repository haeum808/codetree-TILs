import java.util.*;

public class Main {
    static int n;
    static int[][] arr;
    static int[][] directions;
    static int[] dx = new int[]{-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = new int[]{0, 1, 1, 1, 0, -1, -1, -1};

    public static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < n;
    }

    public static int bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        int count = 0;
        if (n == 1) {
            return 0;
        }

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int s = 0; s < size; s++) {
                int[] curPos = queue.poll();
                int curx = curPos[0];
                int cury = curPos[1];
                int dir = directions[curx][cury];

                for (int time = 1;;time++){
                    int nx = curx + dx[dir - 1] * time;
                    int ny = cury + dy[dir - 1] * time;
                    if (!inRange(nx, ny)) break;
                    if (arr[nx][ny] <= arr[curx][cury]) break;

                    queue.add(new int[]{nx, ny});
                }
            }
            count++;
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ㄷㅓ 큰 숫자로 이동하는 것이 가능하도록
        n = sc.nextInt();
        arr = new int[n][n];
        directions = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                directions[i][j] = sc.nextInt();
            }
        }
        int r = sc.nextInt();
        int c = sc.nextInt();

        int answer = bfs(r-1, c-1);
        System.out.println(answer);

    }
}