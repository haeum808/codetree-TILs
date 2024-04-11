import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    for (i in n downTo 1) {
        repeat(n - i) {
            print("  ")
        }

        for (j in 1..i * 2 - 1) {
            print("* ")
        }
        println()
    }

        for (i in 2..n) {
        repeat(n - i) {
            print("  ")
        }

        for (j in 1..i * 2 - 1) {
            print("* ")
        }
        println()
    }
}