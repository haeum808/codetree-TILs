import java.util.Scanner
import kotlin.math.min
import kotlin.math.abs

data class Point(val x: Int, val y: Int)

fun main() {
    val sc = Scanner(System.`in`)

    var result = Int.MAX_VALUE
    val n = sc.nextInt()

    val points = Array(n) { Point(sc.nextInt(), sc.nextInt()) }

    for (i in 0 until n) {
        for (j in i + 1 until n) {
            result = min(result, abs(points[i].x - points[j].x) * abs(points[i].x - points[j].x) + (abs(points[i].y - points[j].y) * abs(points[i].y - points[j].y)))
        }
    }

    print(result)
}