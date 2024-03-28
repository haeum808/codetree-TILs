import java.util.Scanner;
public class Main {
    public static class next_lv {
        String id;
        int level;
        public next_lv() {
            this.id = "codetree";
            this.level = 10;
        }
        public next_lv(String id, int level) {
            this.id= id;
            this.level = level;
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int level = sc.nextInt();
        next_lv lv1 = new next_lv();
        next_lv lv2 = new next_lv(id, level);
        System.out.printf("user %s lv %d\n", lv1.id, lv1.level);
        System.out.printf("user %s lv %d\n", lv2.id, lv2.level);
    }
}