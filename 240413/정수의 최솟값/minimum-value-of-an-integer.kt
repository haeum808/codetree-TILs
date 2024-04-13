import java.util.Scanner
import kotlin.math.min

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()

    print(findMinNumber(a, b, c))
}

fun findMinNumber(a: Int, b: Int, c: Int): Int? {
    return listOf(a, b, c).min()
}