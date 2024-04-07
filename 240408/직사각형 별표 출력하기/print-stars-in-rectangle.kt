import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val (n, m) = sc.nextLine().trim().split(" ").map { it.toInt() }

    repeat(n) {
        repeat(m) {
            print("* ")
        }
        println()
    }
}