import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    var max = Int.MIN_VALUE
    var min = Int.MAX_VALUE

    repeat(3) {
        val input = sc.nextLine()

        max = maxOf(max, input.length)
        min = minOf(min, input.length)
    }

    print(max - min)
}