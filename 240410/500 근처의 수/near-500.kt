import java.util.Scanner
import kotlin.math.max
import kotlin.math.min

fun main() {
    val sc = Scanner(System.`in`)

    var max = 0
    var min = 1001

    repeat(10) {
        val num = sc.nextInt()

        if (num < 500) {
            max = max(max, num)
        } else {
            min = min(min, num)
        }
    }

    print("$max $min")
}