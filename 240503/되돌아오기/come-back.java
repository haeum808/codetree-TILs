import java.util.Scanner;
public class Main {
    static int[] dx = new int[] {1,0,-1,0};//E S W N
    static int[] dy = new int[] {0,-1,0,1};
    public static int dir(char c) {
        if(c == 'E')
            return 0;
        if(c == 'S')
            return 1;
        if(c == 'W')
            return 2;
        if(c == 'N')
            return 3;
        else
            return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int xpos = 0;
        int ypos = 0;
        int time = 0;
        for(int i=0;i<n;i++) {
            char c = sc.next().charAt(0);
            int dir = dir(c);
            int hop = sc.nextInt();
            for(int j=0;j<hop;j++) {
                xpos += dx[dir];
                ypos += dy[dir];
                time++;
                if (xpos == 0 && ypos == 0) {
                    System.out.println(time);
                    return;
                }
            }
        }
        if(time == n) {
            System.out.println(-1);
        }

    }
}