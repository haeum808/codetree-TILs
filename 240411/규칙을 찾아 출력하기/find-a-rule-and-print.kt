import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    for (i in 1..n) {
        for (j in 1..n) {
            if (i == 1 || i == n || j == 1 || j == n) {
                print("* ")
            } else if(i > j) {
                print("* ")
            } else {
                print("  ")
            }
        }
        println()
    }
}