import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    var cnt = 1

    for (i in 1..n) {
        for (j in 1..i) {
            print("${cnt++} ")
        }
        println()
    }
}