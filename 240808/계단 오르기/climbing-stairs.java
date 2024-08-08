import java.util.*;
public class Main {
    static int n;
    static int[] memo;
    public static int dp(int stair) {
        if (stair == 2 ) {
            return memo[0] = 1;
        }
        if (stair == 3) {
            return memo[1] = 1;
        }
        if (stair == 4) {
            return memo[2] = 1;
        }
        if (stair > 4) {
            return memo[stair] = dp(stair - 3) + dp(stair - 2);
        }
        return memo[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        memo = new int[1001];
        System.out.println(dp(n) % 10007);
    }
}