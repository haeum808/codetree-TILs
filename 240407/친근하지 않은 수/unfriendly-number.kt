import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    var cnt = 0

    for (i in 1..n) {
        if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) continue

        cnt++
    }

    print(cnt)
}