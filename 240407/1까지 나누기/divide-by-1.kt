import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var n = sc.nextInt()
    var cnt = 0
    var i = 1

    while(true) {
        cnt++

        if (n / i <= 1) break

        n /= i++
    }

    print(cnt)
}