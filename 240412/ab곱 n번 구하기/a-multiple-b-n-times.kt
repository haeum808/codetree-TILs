import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    repeat(n) {
        val a = sc.nextInt()
        val b = sc.nextInt()

        println((a..b).fold(1) { acc, value -> acc * value })
    }
}