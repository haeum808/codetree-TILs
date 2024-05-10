import java.util.Scanner
import kotlin.math.min

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val numbers = IntArray(n) { sc.nextInt() }
    var min = Int.MAX_VALUE

    for (i in 0 until n) {
        var sum = 0
        for (j in 0 until n) {
            val dist = (j + n - i) % n
            sum += numbers[j] * dist
        }
        min = min(min, sum)
    }

    print(min)
}