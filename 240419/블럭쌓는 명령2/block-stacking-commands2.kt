import java.util.Scanner
import kotlin.math.max

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val k = sc.nextInt()
    val arr = IntArray(n + 1)

    repeat(k) {
        val a = sc.nextInt()
        val b = sc.nextInt()

        (a..b).forEach { arr[it]++ }
    }

    print(arr.max())
}