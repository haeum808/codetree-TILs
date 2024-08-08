import java.util.*;
public class Main {
    static int n;
    static int[] memo;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        memo = new int[1001];

        memo[0] = 1; // 2 -> 1
        memo[1] = 1; // 3 -> 1
        memo[2] = 1; // 4 -> 1
        memo[3] = 2; // 5 ->2
        memo[4] = 2; // 6 -> 2
        memo[5] = 3; // 7 -> 3
        for (int i = 5; i <= n; i++) {
            memo[i] = memo[i - 3] + memo[i - 2];
        }
        System.out.println(memo[n-2]);
    }
}