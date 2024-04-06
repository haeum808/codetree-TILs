import java.util.Scanner
import kotlin.math.max
import kotlin.math.min

fun main() {
    val sc = Scanner(System.`in`)

    val (a, b) = sc.nextLine().trim().split(" ").map { it.toInt() }

    var sum = 0

    for (i in min(a, b)..max(a, b)) {
        if (i % 5 == 0) sum += i
    }

    print(sum)
}