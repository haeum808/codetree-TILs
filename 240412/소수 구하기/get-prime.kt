import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    for (i in 2..n) {
        var cnt = 0

        for (j in 1..i) {
            if (i % j == 0) cnt++
        }

        if (cnt == 2) {
            print("$i ")
        }
    }
}