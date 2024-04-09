import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    var cnt = 1

    val n = sc.nextInt()

    for (i in 1..n) {
        for (j in 1..n) {
            print("${cnt++} ")
        }
        println()
    }
}