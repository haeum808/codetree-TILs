import java.util.Scanner
import kotlin.math.max

fun main() {
    val sc = Scanner(System.`in`)
    var result = 0
    val n = sc.nextInt()
    val arr2D = Array(n) { IntArray(n) { sc.nextInt()} }

    for (i in 0 until n) {
        for (j in 0 until n - 2) {
            result = max(result, arr2D[i][j] + arr2D[i][j + 1] + arr2D[i][j + 2])
        }
    }

    print(result)
}