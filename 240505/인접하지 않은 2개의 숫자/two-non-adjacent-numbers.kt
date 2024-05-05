import java.util.Scanner
import kotlin.math.max

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val numbers = IntArray(n) { sc.nextInt() }
    var result = 0

    for (i in 0 until n) {
        for (j in i + 2 until n) {
            result = max(result, numbers[i] + numbers[j])
        }
    }

    print(result)
}