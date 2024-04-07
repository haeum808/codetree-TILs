import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    for (i in 1..n) {
        repeat(i * 2 - 1) {
            print("*")
        }
        println()
    }
}