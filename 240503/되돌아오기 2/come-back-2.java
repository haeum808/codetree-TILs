import java.util.Scanner;
public class Main {
    static int xdir;
    static int ydir;
    public static void changeDir(char c) {
        if(c == 'L' && xdir ==0 && ydir == 1) {
            xdir = -1;
            ydir = 0;
        }
        else if(c== 'L' && xdir ==0 && ydir ==-1) {
            xdir = 1;
            ydir = 0;
        }
        else if(c=='L' && xdir == 1 && ydir == 0) {
            xdir = 0;
            ydir = 1;
        }
        else if(c=='L' && xdir == -1 && ydir ==0) {
            xdir = 0;
            ydir = -1;
        }
        else if(c=='R' && xdir ==0 && ydir ==1) {
            xdir = 1;
            ydir = 0;
        }
        else if(c=='R' && xdir ==0 && ydir==-1) {
            xdir = -1;
            ydir = 0;
        }
        else if(c=='R'&& xdir ==-1 && ydir==0) {
            xdir = 0;
            ydir = 1;
        }
        else if(c=='R' && xdir ==1 && ydir ==0) {
            xdir = 0;
            ydir = -1;
        }
        else
            return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int len = str.length();
        char[] arr = str.toCharArray();

        int xpos = 0;
        int ypos = 0;
        xdir = 0;
        ydir = 1;
        int time = 0;
        for(int i=0;i<len;i++) {
            if(arr[i]=='F') {
                xpos += xdir;
                ypos += ydir;
                time++;
            }
            else {
                changeDir(arr[i]);
                time++;
            }
            if(xpos==0 && ypos==0) {
                System.out.println(time);
                return;
            }
        }
        System.out.println(-1);
    }
}