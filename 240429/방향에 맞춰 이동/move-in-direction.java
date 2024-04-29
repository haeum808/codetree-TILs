import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int y = 0;
        int[] dx = new int[]{0,1, 0, -1}; //N, E, S, W
        int[] dy = new int[]{1,0, -1,0};
        int num = sc.nextInt();

        for(int i=0;i<num;i++) {
            char c = sc.next().charAt(0);
            int length = sc.nextInt();
            if(c=='N') {
                x += dx[0] * length;
                y += dy[0]* length;
            }
            if(c == 'E') {
                x += dx[1]* length;
                y += dy[1]* length;
            }
            if(c == 'S') {
                x += dx[2]* length;
                y += dy[2]* length;
            }
            if(c == 'W') {
                x += dx[3]* length;
                y += dy[3]* length;
            }
        }
        System.out.println(x + " " + y);
    }

}