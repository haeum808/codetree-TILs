import java.util.Scanner
import kotlin.math.min

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()

    if (c < a && c < b) {
        print(c)
    } else if (b < c && b < a) {
        print(b)
    } else {
        print(a)
    }
}