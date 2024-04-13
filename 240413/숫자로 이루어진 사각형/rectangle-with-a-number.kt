import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    makeNumberSquare(n)
}

fun makeNumberSquare(n: Int) {
    var cnt = 1

    for (i in 1..n) {
        for (j in 1..n) {
            print("${cnt++} ")

            if (cnt == 10) cnt = 1
        }
        println()
    }
}