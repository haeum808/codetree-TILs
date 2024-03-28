import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        String[] arr1 = new String[n];
        String[] arr2 = new String[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextLine();
        }
        int m = 0;
        for(int i = 0; i < n; i++) {
            if (arr1[i].startsWith(s)) {
                arr2[m] = arr1[i];
                m++;
            }
        }
        String[] arr2Trimmed = Arrays.copyOf(arr2, m);
        Arrays.sort(arr2Trimmed);
        System.out.println(arr2Trimmed[k-1]);
    }
}