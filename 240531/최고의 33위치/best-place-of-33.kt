import java.util.Scanner
import kotlin.math.max

var n = 0
var arr2D = Array(1) { IntArray(1) }

fun main() {
    val sc = Scanner(System.`in`)

    n = sc.nextInt()
    arr2D = Array(n) { IntArray(n) { sc.nextInt() } }
    var result = 0

    for (i in 0 until n - 2) {
        for (j in 0 until n - 2) {
            val count = count(i, j)
            result = max(result, count)
        }
    }

    print(result)
}

fun count(i: Int, j: Int): Int {
    var count = 0

    for (x in i .. i + 2) {
        for (y in j .. j + 2) {
            if (arr2D[x][y] == 1) count++
        }
    }

    return count
}