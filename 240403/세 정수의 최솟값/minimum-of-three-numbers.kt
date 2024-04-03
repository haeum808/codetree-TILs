import java.util.Scanner
import kotlin.math.min

fun main() {
    val sc = Scanner(System.`in`)

    val numbers = sc.nextLine().trim().split(" ").map { it.toInt() }

    print(numbers.min())
}