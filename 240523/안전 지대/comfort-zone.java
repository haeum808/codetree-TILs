import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int n;
    static int m;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] arr;
    static boolean[][] visited;
    static int max = 0;
    static int k = 1;

    static ArrayList<Integer> safeArea = new ArrayList<>();
    public static boolean inRange(int x, int y) {
        return 0<= x&& x<n && 0<=y && y<m;
    }
    public static void dfs(int x, int y) {
        if (x == n - 1 && y == m - 1) {
            return;
        }
        for(int i=0;i<4;i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];
            if(inRange(newX, newY) && !visited[newX][newY] && arr[newX][newY] > k){
                visited[newX][newY] = true;
                dfs(newX,newY);
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
                if(max < arr[i][j])
                    max = arr[i][j];
            }
        }
        for(k=1;k<=max;k++){
            visited = new boolean[n][m];
            int count = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (!visited[i][j] && arr[i][j] > k) {
                        dfs(i,j);
                        count++;
                    }
                }
            }
            safeArea.add(count);
        }
        int num = 0;
        ArrayList<Integer> kList = new ArrayList<>();
        for (int i = 0; i < safeArea.size(); i++) {
            if (num < safeArea.get(i)) {
                num = safeArea.get(i);
            }
        }
        for (int i = 0; i < safeArea.size(); i++) {
            if (num == safeArea.get(i)) {
                kList.add(i+1);
            }
        }
        System.out.println(kList.get(0) + " " + num);
    }
}