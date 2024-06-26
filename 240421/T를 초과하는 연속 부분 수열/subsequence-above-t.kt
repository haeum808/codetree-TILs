import java.util.Scanner
import kotlin.math.max

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val k = sc.nextInt()
    val numbers = IntArray(n) { sc.nextInt() }
    var cnt = 0
    var max = 0

    for (i in numbers.indices) {
        if (numbers[i] > k) {
            cnt++
            max = max(max, cnt)
        } else {
            cnt = 0
        }
    }

    if (max == 0) {
        print(0)
    } else {
        print(max)
    }
}