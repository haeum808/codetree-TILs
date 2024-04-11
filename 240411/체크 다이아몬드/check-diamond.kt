import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    for (i in 1..n) {
        repeat(n - i) {
            print(" ")
        }
        for (j in 1..i) {
            print("* ")
        }
        println()
    }

    for (i in n - 1 downTo 1) {
        repeat(n - i) {
            print(" ")
        }
        for (j in 1..i) {
            print("* ")
        }
        println()
    }
}