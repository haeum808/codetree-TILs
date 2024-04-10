import java.util.Scanner
import kotlin.math.max

fun main() {
    val sc = Scanner(System.`in`)

    val numbers = sc.nextLine().trim().split(" ").map { it.toInt() }.max()

    print(numbers)
}