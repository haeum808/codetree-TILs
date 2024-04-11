import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    var cnt = 1

    for (i in n downTo 1) {
        repeat(n - i) {
            print("  ")
        }

        for (j in i downTo 1) {
            print("${cnt++} ")

            if (cnt == 10) cnt = 1
        }
        println()
    }
}