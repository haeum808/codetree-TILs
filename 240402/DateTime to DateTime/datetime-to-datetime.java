import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if(a < 11)
            System.out.println("-1");
        if(a == 11 && b <11)
            System.out.println("-1");
        if(a == 11 && b == 11 && c <11)
            System.out.println("-1");
        int time = (a-11) * 1440 + (b-11) * 60 + (c-11);
        System.out.println(time);
    }
}