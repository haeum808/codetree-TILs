import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    var cnt = 2

    for (i in 1..n) {
        for (j in 1..n) {
            print("${cnt} ")
            cnt += 2

            if (cnt >= 10) cnt = 2
        }
        println()
    }
}