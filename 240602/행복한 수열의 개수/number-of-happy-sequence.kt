import java.util.Scanner
import kotlin.math.max

var n = 0
var m = 0
lateinit var arr2D: Array<IntArray>

fun main() {
    val sc = Scanner(System.`in`)

    n = sc.nextInt()
    m = sc.nextInt()
    arr2D = Array(n) { IntArray(n) { sc.nextInt() } } 

    print(countVertical() + countHorizontal())
}

fun countVertical(): Int {
    var result = 0

    for (i in 0 until n) {
        var count = 0
        var temp = 0

        for (j in 0 until n - 1) {
            if (arr2D[j][i] == arr2D[j + 1][i]) {
                temp++
            } else {
                temp = 0
                continue
            }

            count = max(count, temp + 1)
        }

        if (count >= m - 1) result++
    }

    return result
}

fun countHorizontal(): Int {
    var result = 0

    for (i in 0 until n) {
        var count = 0
        var temp = 0

        for (j in 0 until n - 1) {
            if (arr2D[i][j] == arr2D[i][j + 1]) {
                temp++
            } else {
                temp = 0
                continue
            }

            count = max(count, temp + 1)
        }

        if (count >= m - 1) result++
    }

    return result
}