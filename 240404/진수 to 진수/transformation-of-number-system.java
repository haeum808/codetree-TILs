import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
        String n = sc.next();
        char[] arr = n.toCharArray();
        int length = arr.length;
        int[] digits = new int[20];
        int count = 0;
        int num= 0;
        //10진수로 바꾸기
        for(int i=0;i<length;i++) {
            num = num * a + arr[i]-'0';
        }
        //b진수로 변환
        while(true) {
            if(num < b) {
                digits[count++] = num;
                break;
            }
            digits[count++] = num%b;
            num /= b;
        }
        for(int i=count-1;i>=0;i--) {
            System.out.print(digits[i]);
        }


    }
}