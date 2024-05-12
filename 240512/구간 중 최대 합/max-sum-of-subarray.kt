import java.util.Scanner
import kotlin.math.max

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val k = sc.nextInt()
    val numbers = IntArray(n) { sc.nextInt() }

    var result = Int.MIN_VALUE

    for (i in 0 .. n - k) {
        var temp = 0

        for (j in i until i + k) {
            temp += numbers[j]
        }

        result = max(result, temp)
    }

    print(result)
}