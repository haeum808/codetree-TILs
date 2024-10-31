import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] lines = new int[n][2];

        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();

            lines[i][0] = x1;
            lines[i][1] = x2;
        }
        Arrays.sort(lines, Comparator.comparingInt(a -> a[1]));

        int answer = 0;
        int lastElement = 0;
        for (int i = 0; i < n; i++) {
            if (lines[i][0] > lastElement) {
                answer++;
                lastElement = lines[i][1];
            }
        }
        System.out.println(answer);
    }
}