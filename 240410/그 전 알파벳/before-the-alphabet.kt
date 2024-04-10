import java.util.Scanner
import kotlin.math.abs

fun main() {
    val sc = Scanner(System.`in`)

    val input = sc.next()[0]

    if (input == 'a') print('z')
    else print("${(input.toInt() - 1).toChar()}")
}