import java.util.Scanner
import kotlin.math.abs

fun main() {
    val sc = Scanner(System.`in`)

    val alphabet = sc.next()[0]

    print("${(alphabet.toInt() + 1).toChar()}")
}