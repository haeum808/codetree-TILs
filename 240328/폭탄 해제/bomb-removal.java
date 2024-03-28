import java.util.Scanner;
public class Main {
    public static class bomb {
        String code;
        char color;
        int second;
        public bomb() {
            this.code = "code";
            this.color = 'a';
            this.second = 0;
        }
        public bomb(String code, char color, int second) {
            this.code = code;
            this.color = color;
            this.second = second;
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String code = sc.next();
        char color = sc.next().charAt(0);
        int second = sc.nextInt();
        bomb bomb1 = new bomb(code, color, second);
        System.out.printf("code : %s\n", code);
        System.out.printf("color : %c\n", color);
        System.out.printf("second : %d", second);
    }
}