import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[100];
        for(int i=0;i<100;i++) {
            arr[i] = 0;
        }
        for(int i=0;i<n;i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            for(int j=x;j<=y;j++) {
                arr[j]++;
            }
        }
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(arr[0]);
    }
}