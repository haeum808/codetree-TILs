import java.util.Scanner;

public class Main {
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] arr = new char[n][m];
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                arr[i][j] = 0;
            }
        }
        char ch = 'A';

        int count = n*m;
        int row = 0;
        int col = 0;
        int dir = 0;
        for(int i=0;i<count;i++) {
            arr[row][col] = ch;
            ch++;
            if(ch > 'Z') {
                ch = 'A';
            }
            int nx = row + dx[dir];
            int ny = col + dy[dir];
            if(nx < 0 || nx >= n || ny < 0 || ny >= m || arr[nx][ny] != 0) {
                dir = (dir + 1) % 4;
            }
            row += dx[dir];
            col += dy[dir];
        }
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}