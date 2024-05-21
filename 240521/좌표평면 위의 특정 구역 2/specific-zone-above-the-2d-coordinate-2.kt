import java.util.Scanner
import kotlin.math.max
import kotlin.math.min

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val points = Array(n) { IntArray(2) { sc.nextInt() } }
    var answer = Int.MAX_VALUE

    for (i in 0 until n) {
        var maxX = Int.MIN_VALUE
        var minX = Int.MAX_VALUE
        var maxY = Int.MIN_VALUE
        var minY = Int.MAX_VALUE

        for (j in 0 until n) {
            if (i == j) continue

            val x = points[j][0]
            val y = points[j][1]

            maxX = max(maxX, x)
            minX = min(minX, x)
            maxY = max(maxY, y)
            minY = min(minY, y)
        }

        answer = min(answer, (maxX - minX) * (maxY - minY))
    }

    print(answer)
}