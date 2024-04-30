import java.util.Scanner;
public class Main {

    static int[] dx = new int[]{1,0,-1,0}; // R D L U
    static int[] dy = new int[]{0,-1,0,1};
    public static int dir(char c) {
        if (c== 'R')
            return 0;
        if (c== 'D')
            return 1;
        if (c== 'L')
            return 2;
        if (c== 'U')
            return 3;
        else
            return -1;
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
            if(xpos ==1||xpos>n|| ypos ==1 ||ypos>n) {
                i++;
                dir = (dir+2)%4;
            }
            xpos += dx[dir];
            ypos += dy[dir];
        }

        xpos -= 1;
        ypos -= 1;
        System.out.println(ypos + " "+ xpos);
    }
}