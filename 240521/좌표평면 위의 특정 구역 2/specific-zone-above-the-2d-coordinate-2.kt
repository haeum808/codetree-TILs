import java.util.Scanner
import kotlin.math.max
import kotlin.math.min

const val INT_MAX = Int.MAX_VALUE
const val MAX_N = 100
const val MAX_NUM = 40_000

var n = MAX_N
val x = IntArray(MAX_N)
val y = IntArray(MAX_N)

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    for (i in 0 until n) {
        x[i] = sc.nextInt()
        y[i] = sc.nextInt()
    }

    var answer = INT_MAX

    for (i in 0 until n) {
        var maxX = 1
        var minX = INT_MAX
        var maxY = 1
        var minY = INT_MAX

        for (j in 0 until n) {
            if (i == j) continue
            
            maxX = max(maxX, x[j])
            minX = min(minX, x[j])
            maxY = max(maxY, y[j])
            minY = min(minY, y[j])
        }

        answer = min(answer, (maxX - minX) * (maxY - minY))
    }

    print(answer)
}