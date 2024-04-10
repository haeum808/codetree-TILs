import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val A = sc.next()
    var cnt = 0

    repeat(n) {
        if (A == sc.next()) cnt++
    }

    print(cnt)
}