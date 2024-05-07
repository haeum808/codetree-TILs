import java.util.Scanner
import kotlin.math.min
import kotlin.math.abs

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val s = sc.nextInt()
    val numbers = IntArray(n) { sc.nextInt() }
    var result = Int.MAX_VALUE

    for (i in 0 until n - 1) {
        for (j in i + 1 until n) {
            var temp = 0

            for (k in 0 until n) {
                if (k != i && k != j) {
                    temp += numbers[k]
                }
            }

            result = min(result, abs(s - temp))
        }
    }

    print(result)
}