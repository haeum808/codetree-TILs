import java.util.Scanner
import kotlin.math.min

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()

    if (a == listOf(a, b, c).min()) {
        print("1")
    } else {
        print("0")
    }

    if(a == b && b == c) {
        print(" 1")
    } else {
        print(" 0")
    }
}