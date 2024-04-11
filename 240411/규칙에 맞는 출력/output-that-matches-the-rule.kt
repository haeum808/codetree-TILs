import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    for (i in 1..n) {
        for (j in i downTo 1) {
            print("${n + 1 - j} ")
        }
        println()
    }
}