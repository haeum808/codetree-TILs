import java.util.Scanner
import kotlin.math.max

var n = 0
var arr2D = Array(1) { IntArray(1) }

fun main() {
    val sc = Scanner(System.`in`)

    n = sc.nextInt()
    arr2D = Array(n) { IntArray(n) { sc.nextInt() } }
    var result = 0

    for (i in 0 until n) {
        if (i + 2 > n) continue

        for (j in 0 until n) {
            if (j + 2 > n) continue

            val count = count(i, j)
            result = max(result, count)
        }
    }

    print(result)
}

fun count(i: Int, j: Int): Int {
    var count = 0

    for (x in i until n) {
        for (y in j until n) {
            if (arr2D[x][y] == 1) count++
        }
    }

    return count
}