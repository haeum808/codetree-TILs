import java.util.Scanner
import kotlin.math.max

var arr = Array(1) { 0 }

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    arr = Array(n) { sc.nextInt() }

    print(findMax(n - 1))
}

fun findMax(n: Int): Int {
    if (n == 0) {
        return arr[0]
    }

    return max(arr[n], findMax(n - 1))
}