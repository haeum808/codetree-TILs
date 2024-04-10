import java.util.Scanner
import kotlin.math.min
import kotlin.math.abs

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextLine().trim().toInt()
    var min = 200
    val numbers = sc.nextLine().trim().split(" ").map { it.toInt() }

    for (i in 0..n - 2) {
        for (j in i + 1..n - 1) {
            min = min(min, abs(numbers[i] - numbers[j]))
        }
    }

    print(min)
}