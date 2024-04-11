import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    for (i in 1..2 * n + 1) {
        for (j in 1..2 * n + 1) {
            if (i % 2 != 0) {
                print("* ")
            } else {
                if (j % 2 != 0) {
                    print("* ")
                } else {
                    print("  ")
                }
            }
        }
        println()
    }
}