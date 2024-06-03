import java.util.Scanner
import kotlin.math.max

data class Point(
    val x: Int,
    val y: Int
)

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val m = sc.nextInt()
    var result = 0

    val arr2D = Array(n) { IntArray(m) { sc.nextInt() } }

    val dxdy = listOf(
        listOf(Point(0, -1), Point(0, 1)),
        listOf(Point(-1, 0), Point(1, 0)),
        listOf(Point(-1, -1), Point(-1, 0)),
        listOf(Point(-1, 1), Point(-1, 0)),
        listOf(Point(1, -1), Point(1, 0)),
        listOf(Point(1, 1), Point(1, 0))
    )

    for (i in 0 until n) {
        for (j in 0 until m) {
            for (k in 0 until 6) {
                val nx1 = i + dxdy[k][0].x
                val ny1 = j + dxdy[k][0].y
                val nx2 = i + dxdy[k][1].x
                val ny2 = j + dxdy[k][1].y

                if (nx1 in 0 until n && nx2 in 0 until n && ny1 in 0 until m && ny2 in 0 until m) {
                    result = max(result, arr2D[i][j] + arr2D[nx1][ny1] + arr2D[nx2][ny2])
                }
                
            }
        }
    }

    print(result)
}