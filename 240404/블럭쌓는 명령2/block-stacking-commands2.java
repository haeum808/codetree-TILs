import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        Integer[] arr = new Integer[n];
        for(int i=0;i<n;i++) {
            arr[i] = 0;
        }
        for(int i=0;i<k;i++) {
            int n1 = sc.nextInt();
            int k1 = sc.nextInt();
            for(int s =n1;s<=k1;s++) {
                arr[s]++;
            }
        }
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(arr[0]);
    }
}