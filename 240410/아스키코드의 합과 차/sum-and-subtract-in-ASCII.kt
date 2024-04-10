import java.util.Scanner
import kotlin.math.abs

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.next()
    val b = sc.next()

    print("${a[0].toInt() + b[0].toInt()} ${abs(a[0].toInt() - b[0].toInt())}")
}