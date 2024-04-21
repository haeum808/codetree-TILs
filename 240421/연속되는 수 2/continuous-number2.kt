import java.util.Scanner
import kotlin.math.max

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val numbers = IntArray(n) { sc.nextInt() }
    var cnt = 0
    var max = 0

    for (i in numbers.indices) {
        cnt++
        if (i == 0 || numbers[i] != numbers[i - 1]) {
            max = max(max, cnt)
            cnt = 0
        }
    }

    print(max)
}