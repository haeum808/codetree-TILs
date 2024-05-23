import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int[] dx = new int[]{1, 0, -1, 0};
    static int[] dy = new int[]{0, 1, 0, -1};
    static int n;
    static int k;
    static int[][] arr;
    static boolean[][] visited;
    static Queue<int[]> q = new LinkedList<>();
    public static boolean inRange(int x, int y){
        return 0<=x && x<n && 0<=y && y<n;
    }
    public static void bfs(int x, int y) {
        //0 : 지나갈 수 있음
        //1 : 지나갈 수 없음
        q.add(new int[]{x, y});
        while (!q.isEmpty()) {
            int[] curPos = q.poll();
            int curX = curPos[0];
            int curY = curPos[1];
            visited[curX][curY] = true;
            for(int i=0;i<4;i++) {
                int newX = curX + dx[i];
                int newY = curY + dy[i];
                if (inRange(newX, newY) && !visited[newX][newY] && arr[newX][newY] == 0) {
                    visited[newX][newY] = true;
                    q.add(new int[]{newX, newY});
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // 격자의 크기
        k = sc.nextInt(); // 시작점의 수
        arr = new int[n][n];
        visited = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        //시작점 -> bfs() k개 만큼 실행
        int countB = 0;
        for (int i = 0; i < k; i++) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            bfs(r-1, c-1);
        }
        //방문처리한 0 개수 세면 된다.
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                if(visited[x][y]) {
                    countB++;
                }
            }
        }
        System.out.println(countB);
    }
}