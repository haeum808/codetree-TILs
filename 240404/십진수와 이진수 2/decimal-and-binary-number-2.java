import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = str.toCharArray();
        int length = arr.length;
        int n = 0;
        for(int i=0;i<length;i++) {
            n = n * 2 + arr[i] - '0';
        }
        n *= 17;
        int[] digits = new int[20];
        int count = 0;
        while(true) {
            if(n<2) {
                digits[count++] = n;
                break;
            }
            digits[count++] = n%2;
            n /= 2;
        }
        for(int i=count-1;i>=0;i--) {
            System.out.print(digits[i]);
        }
    }
}