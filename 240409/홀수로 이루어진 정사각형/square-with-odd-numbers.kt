import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    var first = 10

    for (i in 1..n) {
        for (j in 1..n) {
            print("${first + (j * 2 - 1)} ")
        }
        first += 2
        println()
    }
}