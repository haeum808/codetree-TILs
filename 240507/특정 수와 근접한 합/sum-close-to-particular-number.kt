import java.util.Scanner
import kotlin.math.min
import kotlin.math.abs

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val s = sc.nextInt()
    val numbers = IntArray(n) { sc.nextInt() }
    var result = abs(s - numbers.filterIndexed { acc, idx -> idx != 0 && idx != n - 1  }.sum())

    for (i in 0 until n - 1) {
        var temp = 0

        for (j in 0 until n - 1) {
            if (numbers[j] != numbers[i] && numbers[j] != numbers[i + 1]) {
                temp += numbers[j]
            }
        }

        result = min(result, abs(s - temp))
    }

    print(result)
}