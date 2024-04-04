import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int[] digits = new int[20];
        int count = 0;
        while(true) {
            if(n < b) {
                digits[count++] = n;
                break;
            }
            digits[count++] = n%b;
            n = n/b;
        }
        for(int i = count-1;i>=0;i--) {
            System.out.print(digits[i]);
        }
    }
}