import java.util.Scanner;
public class Main {
    public static class stuff{
        String name;
        int code;
        public stuff() {
            this.name = "codetree";
            this.code = 50;
        }
        public stuff(String name, int code) {
            this.name = name;
            this.code = code;
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int code = sc.nextInt();
        stuff stuff1 = new stuff();
        stuff stuff2 = new stuff(name, code);

        System.out.printf("product %d is %s\n", stuff1.code, stuff1.name);
        System.out.printf("product %d is %s\n", stuff2.code, stuff2.name);
    }
}