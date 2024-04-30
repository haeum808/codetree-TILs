import java.util.Scanner
import kotlin.math.min
import kotlin.math.abs

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val arr = IntArray(n) { sc.nextInt() }
    var min = Int.MAX_VALUE

    for (i in 0 until n) {
        var sum = 0

        for (j in 0 until n) {
            sum += abs(i - j) * arr[j]
        }

        min = min(min, sum)
    }

    print(min)
}