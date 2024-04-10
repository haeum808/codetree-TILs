import java.util.Scanner
import kotlin.math.max

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextLine()
    val numbers = sc.nextLine().trim().split(" ").map { it.toInt() }
    val min = numbers.min()

    print("${min} ${numbers.count { it == min }}")
}