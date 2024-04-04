import java.util.Scanner
import kotlin.math.min
import kotlin.math.max

fun main() {
    val sc = Scanner(System.`in`)

    val (a, b) = sc.nextLine().trim().split(" ").map { it.toInt() }

    for (i in max(a, b) downTo min(a, b)) {
        print("$i ")
    }
}