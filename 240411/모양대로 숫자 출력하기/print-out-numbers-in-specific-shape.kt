import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    for (i in n downTo 1) {
        repeat(n - i) {
            print("  ")
        }

        for (j in i downTo 1) {
            print("${j} ")
        }
        println()
    }
}