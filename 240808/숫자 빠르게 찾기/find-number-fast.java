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
        Arrays.sort(arr);
        int[] find = new int[m];
        for (int i = 0; i < m; i++) {
            find[i] = sc.nextInt();
            int left = 0;
            int right = n-1;
            int index = -1;
            while (left <= right) {
                int mid = (left + right) / 2;
                if (find[i] == arr[mid]) {
                    index = mid + 1; 
                    break;
                }
                if (find[i] > arr[mid]) {
                    left = mid + 1;
                }
                if (find[i] < arr[mid]) {
                    right = mid-1;
                }
            }
            System.out.println(index);
        }
    }
}