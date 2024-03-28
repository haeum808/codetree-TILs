import java.util.Scanner;
public class Main {
    public static class cr {
        String secret_code;
        char alpha;
        int time;
        public cr(String secret_code, char alpha, int time) {
            this.secret_code = secret_code;
            this.alpha = alpha;
            this.time = time;
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        cr cr1 = new cr("ab",'a',0);
        String secret_code = sc.next();
        char alpha = sc.next().charAt(0);
        int time = sc.nextInt();
        cr1.secret_code = secret_code;
        cr1.alpha = alpha;
        cr1.time = time;
        System.out.printf("secret code : %s\n", secret_code);
        System.out.printf("meeting point : %c\n", alpha);
        System.out.printf("time : %d", time);
    }
}