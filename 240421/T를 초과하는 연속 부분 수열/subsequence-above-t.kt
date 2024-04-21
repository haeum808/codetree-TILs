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
        if (numbers[i] > k && (i == 0 || ((numbers[i] > numbers[i - 1]) && numbers[i - 1] > k))) {
            cnt++
            max = max(max, cnt)
        } else {
            cnt = 0
        }
    }

    if (cnt == 0) {
        print(cnt)
    } else {
        print(max + 1)
    }
}