import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val dp = IntArray(46)
    val n = sc.nextInt()

    dp[1] = 1
    dp[2] = 1

    for (i in 3..n) {
        dp[i] = dp[i - 1] + dp[i - 2]
    }

    print(dp[n])
}