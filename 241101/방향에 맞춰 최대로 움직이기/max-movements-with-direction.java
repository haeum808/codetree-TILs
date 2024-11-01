import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static final int MAX_N = 4;

    public static int n;
    public static int[][] num = new int[MAX_N][MAX_N];
    public static int[][] moveDir = new int[MAX_N][MAX_N];
    public static int ans;

    public static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < n;
    }

    public static boolean canGo(int x, int y, int prevNum) {
        return inRange(x, y) && num[x][y] > prevNum;
    }

    public static void findMax(int startX, int startY) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{startX, startY, 0}); // {x, y, cnt}
        ans = 0;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int cnt = current[2];

            ans = Math.max(ans, cnt);

            int[] dx = new int[]{-1, -1, 0, 1, 1, 1, 0, -1};
            int[] dy = new int[]{0, 1, 1, 1, 0, -1, -1, -1};
            int d = moveDir[x][y] - 1;

            for (int i = 1; i < n; i++) { // i는 1부터 시작
                int nx = x + dx[d] * i;
                int ny = y + dy[d] * i;
                if (canGo(nx, ny, num[x][y])) {
                    queue.add(new int[]{nx, ny, cnt + 1});
                } else {
                    break; // 더 이상 진행할 수 없으므로 종료
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                num[i][j] = sc.nextInt();

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                moveDir[i][j] = sc.nextInt();

        int r = sc.nextInt();
        int c = sc.nextInt();

        findMax(r - 1, c - 1);
        System.out.print(ans);
    }
}