import java.util.Scanner;

public class Main {
    static int n;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static boolean[][] visited;
    static int[][] arr;
    static int k = 1;
    public static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < n;
    }
    // 누적합
    public static int dfs(int x, int y, int k) {
        if(!inRange(x,y) || visited[x][y] || arr[x][y] !=k) {
            return 0;
        }
        visited[x][y] = true;
        int blocksize =1;
        for (int i = 0; i < 4; i++) {
            blocksize += dfs(x + dx[i], y + dy[i], k);
        }
        return blocksize;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        arr = new int[n][n];
        visited = new boolean[n][n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
                if(max< arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        //max 값 나옴 k=1 ~ max까지 for문
        //블록 크기의 최대를 구해야함
        int totalBlock = 0; //-> 터지게 되는 블럭의 수
        int sizeBlock = 0; // -> 최대 블럭의 크기
        // k 쭉 돌고 -> 그 안에서 dfs 얼마나 내려가는지 : sizeblock
        // dfs k에 따라 몇번 하는지 : total

        for (k = 1; k <= max; k++) {
            visited = new boolean[n][n];
            int curSize = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if(!visited[i][j] && arr[i][j] ==k){
                        int dfsCount = dfs(i, j, k);
                        curSize = Math.max(curSize, dfsCount);
                        if (dfsCount >= 4) {
                            totalBlock++;
                        }
                    }
                }
            }
            sizeBlock = Math.max(curSize, sizeBlock);
        }
        System.out.println(totalBlock+ " "+ sizeBlock);

    }
}