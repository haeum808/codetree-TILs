import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val (a, b) = sc.nextLine().trim().split(" ").map { it.toInt() }

    for (i in 1..a) {
        for (j in 1..b) {
            print("${i * j} ")
        }
        println()
    }
}