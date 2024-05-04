import java.util.Scanner;
public class Main {
    static int[] dx = new int[]{1,0,-1,0};
    static int[] dy = new int[]{0,1,0,-1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                arr[i][j] = 0;
            }
        }

        int row = 0;
        int col = 0;
        int direction = 0; 
        for (int num = 1; num <= n * m; num++) {
            arr[row][col] = num; 
            int nextRow = row + dx[direction];
            int nextCol = col + dy[direction];

            if (nextRow < 0 || nextRow >= n || nextCol < 0 || nextCol >= m || arr[nextRow][nextCol] != 0) {
                direction = (direction + 1) % 4; 
                nextRow = row + dx[direction];
                nextCol = col + dy[direction];
            }

            row = nextRow;
            col = nextCol;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}