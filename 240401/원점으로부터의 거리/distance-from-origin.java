import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static class Dv implements Comparable<Dv>{
        int x;
        int y;
        int index;
        public Dv() {
            this.x = 0;
            this.y = 0;
            this.index = 0;
        }
        public Dv(int x, int y, int index) {
            this.x =x;
            this.y= y;
            this.index = index;
        }
        @Override
        public int compareTo(Dv dv) {
            if ((Math.abs(this.x - 0) + Math.abs(this.y - 0)) == (Math.abs(dv.x - 0) + Math.abs(dv.y - 0))) {
                return this.index - dv.index;
            }
            return (Math.abs(this.x - 0)+Math.abs(this.y-0)) - (Math.abs(dv.x - 0) + Math.abs(dv.y-0));
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Dv[] dvs = new Dv[n];
    
        for(int i=0;i<n;i++) {
            dvs[i]= new Dv();
        }
        for(int i=0;i<n;i++) {
            dvs[i].x = sc.nextInt();
            dvs[i].y = sc.nextInt();
            dvs[i].index = i+1;
        }
        Arrays.sort(dvs);
        for(int i=0;i<n;i++) {
            System.out.println(dvs[i].index);
        }
    }
}