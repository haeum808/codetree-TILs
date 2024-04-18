import java.util.Scanner
import kotlin.math.abs

class Point(
    val x: Int,
    val y: Int,
    val id: Int
)

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val points = List(n) {
        Point(sc.nextInt(), sc.nextInt(), it + 1)
    }

    points.sortedWith(
        compareBy(
            { abs(it.x) + abs(it.y) },
            { it.id }
        )
    ).forEach {
        println("${it.id}")
    }
}