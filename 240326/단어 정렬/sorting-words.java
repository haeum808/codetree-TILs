import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strArr = new String[n];
        for(int i=0;i<n;i++) {
            strArr[i] = sc.next();
        }
        Arrays.sort(strArr);
        for(int i=0;i<n;i++) {
            System.out.println(strArr[i]);
        }
    }
}