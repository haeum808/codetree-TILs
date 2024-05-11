import java.util.Scanner
import kotlin.math.min
import kotlin.math.abs

data class Point(val x: Int, val y: Int)

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    val points = Array(n) { Point(sc.nextInt(), sc.nextInt()) }
    var result = Int.MAX_VALUE

    var sum = 0

    for (i in 1 until n) {
        sum += abs(points[i].x - points[i - 1].x) + abs(points[i].y - points[i - 1].y)
    }

    for (i in 1 until n - 1) {
        var min = 0 
        min += abs(points[i].x - points[i - 1].x) + abs(points[i].y - points[i - 1].y)
        min += abs(points[i].x - points[i + 1].x) + abs(points[i].y - points[i + 1].y)
        min -= abs(points[i - 1].x - points[i + 1].x) + abs(points[i - 1].y - points[i + 1].y)
        
        result = min(result, sum - min)
    }

    print(result)
}