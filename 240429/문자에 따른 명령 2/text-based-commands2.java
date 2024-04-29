import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int length = str.length();
        char[] arr = str.toCharArray();
        int dirnum = 0;
        int x = 0;
        int y = 0;
        int[] dx = new int[]{0,1,0,-1};
        int[] dy = new int[]{1,0,-1,0};
        for(int i=0;i<length;i++) {
            if(arr[i]=='L')
                dirnum += 3;
            if(arr[i]=='R')
                dirnum += 1;
            if(arr[i]=='F')
                x += dx[dirnum%4];
                y += dy[dirnum%4];
        }

        System.out.println(x+ " "+y);
    }
}