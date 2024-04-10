import java.util.Scanner
import kotlin.math.max

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextLine().trim().toInt()
    val profits = sc.nextLine().trim().split(" ").map { it.toInt() }
    var max = 0

    for (i in 0..n - 2) {
        for (j in i + 1..n - 1) {
            max = max(max, profits[j] - profits[i])
        }
    }

    print(max)
}