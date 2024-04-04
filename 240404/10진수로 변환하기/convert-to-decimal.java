import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc =new Scanner(System.in);
        String n = sc.next();
        char[] arr = n.toCharArray();
        int length = arr.length;
        int num = 0;
        for(int i=0;i<length;i++) {
            num = num * 2 + (arr[i] - '0');
        }
        System.out.println(num);
    }
}