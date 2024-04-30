import java.util.Scanner;
public class Main {

    static int[] dy = new int[]{1,0,-1,0};
    static int[] dx = new int[]{0,-1,0,1};
    public static int dir(char c) {
        if(c=='R') // x좌표 증가
            return 0;
        if(c=='D') // y좌표 감소
            return 1;
        if(c=='L') //x좌표 감소
            return 2;
        if(c=='U') //y좌표 증가
            return 3;
        else
            return -1;
    }
    public static boolean isRange(int x, int y, int n) {
        return 1<x && x<n && 1<y && y<n;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();

        int xpos = sc.nextInt();
        int ypos = sc.nextInt();
        char c = sc.next().charAt(0);
        int dir = dir(c);
        for(int i=0;i<t;i++) {
            if(xpos<1||xpos>n||ypos<1||ypos>n) {
                dir = (dir+2)%4;
                System.out.println("dir = " + dir);
                i--;
            }
            xpos += dx[dir];
            ypos += dy[dir];
            System.out.println(xpos+ " "+ ypos);
        }

        System.out.println(xpos+ " "+ ypos);
    }
}