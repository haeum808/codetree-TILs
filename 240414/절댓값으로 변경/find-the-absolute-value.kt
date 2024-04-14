import java.util.Scanner
import kotlin.math.abs

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val array = IntArray(n)

    for (i in 0..n-1) {
        array[i] = sc.nextInt()
    }

    absolute(array)

    print(array.joinToString(" "))
}

fun absolute(array: IntArray) {
    for (i in array.indices) {
        array[i] = abs(array[i])
    }
}