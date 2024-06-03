import java.util.Scanner
import kotlin.math.max

data class Point(
    val x: Int,
    val y: Int
)

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt() + 2
    val m = sc.nextInt() + 2
    var result = 0

    val arr2D = Array(n) { i -> IntArray(m) { j -> if (i == 0 || j == 0 || i == n - 1 || j == m - 1) 0 else sc.nextInt() } }

    val dxdy = listOf(
        listOf(Point(0, -1), Point(0, 1)),
        listOf(Point(-1, 0), Point(1, 0)),
        listOf(Point(-1, -1), Point(-1, 0)),
        listOf(Point(-1, 1), Point(-1, 0)),
        listOf(Point(1, -1), Point(1, 0)),
        listOf(Point(1, 1), Point(1, 0))
    )

    for (i in 1 until n - 1) {
        for (j in 1 until m - 1) {
            for (k in 0 until 6) {
                val nx1 = i + dxdy[k][0].x
                val ny1 = j + dxdy[k][0].y
                val nx2 = i + dxdy[k][1].x
                val ny2 = j + dxdy[k][1].y

                result = max(result, arr2D[i][j] + arr2D[nx1][ny1] + arr2D[nx2][ny2])
            }
        }
    }

    print(result)
}