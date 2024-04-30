import java.util.Scanner;
public class Main {
    static int[] dx = new int[] {1,0,-1,0}; //E S W N
    static int[] dy = new int[] {0,-1,0,1};

    public static boolean getIn(int x, int y, int n) {
        return (0<=x && x <n && 0 <= y && y < n);
    }
    public static boolean overThree(int x, int y, int[][] arr,int[] dx, int[] dy, int n) {
        int count = 0;
        for(int i=0;i<4;i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(getIn(nx,ny,n)==true&& arr[nx][ny]==1) {
                count++;
            }
        }
        if(count>=3)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int count = 0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(getIn(i,j,n) && overThree(i,j,arr,dx,dy, n))
                    count++;
            }
        }
        System.out.println(count);
    }
}