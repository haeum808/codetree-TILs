import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] find = new int[m];
        int count =1;
        for (int i = 0; i < m; i++) {
            boolean check = false;
            find[i] = sc.nextInt();
            int left = 0;
            int right = n-1;
            while (left <= right) {
                int mid = (left + right) / 2;
                if (find[i] == arr[mid]) {
                    check = true;
                    break;
                }
                if (find[i] > arr[mid]) {
                    left = mid + 1;
                }
                if (find[i] < arr[mid]) {
                    right = mid-1;
                }
            }
            if (check) {
                System.out.println(count);
                count++;
            } else {
                System.out.println(-1);
            }
        }
    }
}